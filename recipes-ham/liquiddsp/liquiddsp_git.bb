SUMMARY = "Liquiddsp"

DESCRIPTION = "Liquiddsp is a free and open-source signal processing library for \
software-defined radios written in C. Its purpose is to provide a set of \
extensible DSP modules that do not rely on external dependencies or cumbersome \
frameworks."

HOMEPAGE = "https://liquidsdr.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=860e4083ceb93ce0939b1a58fcaacb53"

SRC_URI = "git://github.com/jgaeddert/liquid-dsp.git;protocol=https;branch=master \
          "

SRCREV = "c68f5e39434433c88bd4fe19784bf4c8a32aa8e4"

S = "${WORKDIR}/git"

inherit autotools-brokensep
INSANE_SKIP:${PN}-dev += "dev-elf"
RDEPENDS:${PN}-dev = ""
