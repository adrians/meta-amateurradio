SUMMARY = "WSJT-X"

DESCRIPTION = "WSJT-X implements communication protocols or 'modes' called \
FST4, FST4W, FT4, FT8, JT4, JT9, JT65, QRA64, ISCAT, MSK144, and WSPR, as well \
as one called Echo for detecting and measuring your own radio signals \
reflected from the Moon. These modes were all designed for making reliable, \
confirmed QSOs under extreme weak-signal conditions."

HOMEPAGE = "https://physics.princeton.edu/pulsar/k1jt/wsjtx.html"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ee272f0a941cfe6ea96c7a0a7990260"

SRC_URI = "git://git.code.sf.net/p/wsjt/wsjtx;protocol=git;nobranch=1 \
           file://0001-Add-shmem-dependency-to-jt9.patch \
           file://0002-Disable-openmp-code.patch \
          "

# the wsjtx-2.5.4 tag:
SRCREV = "d28164e92a3a6b4c27e55da0c2ef9dc9ade2c30c"

S = "${WORKDIR}/git"

DEPENDS = "qttools-native asciidoc-native libgfortran boost fftw libusb \
           qtmultimedia qtserialport hamlib qttools portaudio-v19"

# WSPR, FT8 and other similar protocols require a synchronized system clock and
# adjusted volume levels. This is why ntpdate and alsamixer are recommended.
RRECOMMENDS_${PN} = "alsa-utils-alsamixer"
RSUGGESTS_${PN} = "ntpdate"

inherit cmake_qt5

EXTRA_OECMAKE = " \
                 -DWSJT_GENERATE_DOCS='OFF' \
                 -Dhamlib_LIBRARY_DIRS='${WORKDIR}/recipe-sysroot/usr/lib/' \
                "

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"
OECMAKE_GENERATOR = "Unix Makefiles"

INSANE_SKIP_${PN} += "already-stripped"

# Because some of the code is written in fortran, we'll need GCC with fortran
# support built-in. To enable this, you must add the following line to the
# conf/local.conf file:
#
# FORTRAN_forcevariable = ",fortran"
#
