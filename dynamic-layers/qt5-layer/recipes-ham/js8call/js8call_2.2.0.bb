SUMMARY = "JS8Call"

DESCRIPTION = "JS8Call is software using the JS8 Digital Mode providing weak \
signal keyboard to keyboard messaging to Amateur Radio Operators."

HOMEPAGE = "http://js8call.com/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=95b4671532b5d104b42841286d58c520"

SRC_URI = "git://bitbucket.org/widefido/js8call.git;protocol=https;branch=js8call \
           file://0001-Disable-openmp-code.patch \
          "

SRCREV = "99018054a3b273f7086f4e086f5b848c645c23c8"

S = "${WORKDIR}/git"

DEPENDS = "qttools-native asciidoc-native libgfortran boost fftw libusb \
           qtmultimedia qtserialport hamlib qttools"

# WSPR, FT8 and other similar protocols require a synchronized system clock and
# adjusted volume levels. This is why ntpdate and alsamixer are recommended.
RRECOMMENDS_${PN} = "alsa-utils-alsamixer"
RSUGGESTS_${PN} = "ntpdate"

inherit cmake_qt5

# wsjtx
EXTRA_OECMAKE = " \
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
