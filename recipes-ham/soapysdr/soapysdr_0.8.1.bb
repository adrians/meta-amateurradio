SUMMARY = "SoapySDR project"

DESCRIPTION = "A fresh and clean vendor neutral and platform independent SDR \
support library."

HOMEPAGE = "https://github.com/pothosware/SoapySDR/wiki"

LICENSE = "BSL-1.0 & MIT & Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE_1_0.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

SRCREV = "1cf5a539a21414ff509ff7d0eedfc5fa8edb90c6"
SRC_URI = "git://github.com/pothosware/SoapySDR.git;protocol=git;branch=master \
          "

S = "${WORKDIR}/git"

inherit cmake
