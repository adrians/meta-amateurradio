SUMMARY = "csdr"

DESCRIPTION = "csdr is a command line tool to carry out DSP tasks for Software \
Defined Radio."

HOMEPAGE = "https://github.com/ha7ilm/csdr"

LICENSE = "BSD & GPLv3+"
LIC_FILES_CHKSUM = "file://README.md;md5=655403e2809c61b2c0bc7446f148cfd7"

SRC_URI = "git://github.com/simonyiszk/csdr.git;protocol=git;branch=master \
           file://0001-Adjust-makefile-for-yocto-build.patch \
          "

SRCREV = "6ef2a74206887155290a54c7117636f66742f858"
S = "${WORKDIR}/git"

inherit autotools-brokensep

DEPENDS = "fftw"
RDEPENDS:${PN} = "bash"

do_install () {
    oe_runmake install PREFIX=${D}
}

