SUMMARY = "CubicSDR"

DESCRIPTION = "CubicSDR is a cross-platform Software-Defined Radio application \
which allows you to navigate the radio spectrum and demodulate any signals you \
might discover."

HOMEPAGE = "https://cubicsdr.com/"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/cjcliffe/CubicSDR.git;protocol=https;branch=master \
          "

SRCREV = "7b1956f7cd48e9adb520d862814573dd3130e59f"

S = "${WORKDIR}/git"

inherit cmake
DEPENDS = "virtual/libgles2 wxwidgets liquiddsp soapysdr pulseaudio"
RDEPENDS:${PN} = "liquiddsp-dev"

INSANE_SKIP:${PN} += "dev-deps"
