/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowDownload: ImageVector
    get() {
        if (_ArrowDownload != null) {
            return _ArrowDownload!!
        }
        _ArrowDownload = ImageVector.Builder(
            name = "Regular.ArrowDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.25f, 20.501f)
                curveTo(18.664f, 20.501f, 19f, 20.837f, 19f, 21.251f)
                curveTo(19f, 21.665f, 18.664f, 22.001f, 18.25f, 22.001f)
                lineTo(5.25f, 22.005f)
                curveTo(4.836f, 22.005f, 4.5f, 21.669f, 4.5f, 21.255f)
                curveTo(4.5f, 20.841f, 4.836f, 20.505f, 5.25f, 20.505f)
                lineTo(18.25f, 20.501f)
                close()
                moveTo(11.648f, 2.013f)
                lineTo(11.75f, 2.006f)
                curveTo(12.13f, 2.006f, 12.443f, 2.288f, 12.493f, 2.654f)
                lineTo(12.5f, 2.756f)
                lineTo(12.499f, 16.441f)
                lineTo(16.221f, 12.72f)
                curveTo(16.487f, 12.454f, 16.904f, 12.43f, 17.197f, 12.648f)
                lineTo(17.281f, 12.721f)
                curveTo(17.548f, 12.987f, 17.572f, 13.404f, 17.354f, 13.697f)
                lineTo(17.281f, 13.781f)
                lineTo(12.284f, 18.778f)
                curveTo(12.018f, 19.044f, 11.601f, 19.068f, 11.308f, 18.851f)
                lineTo(11.224f, 18.778f)
                lineTo(6.22f, 13.782f)
                curveTo(5.927f, 13.489f, 5.927f, 13.014f, 6.219f, 12.721f)
                curveTo(6.485f, 12.455f, 6.902f, 12.43f, 7.196f, 12.648f)
                lineTo(7.28f, 12.72f)
                lineTo(10.999f, 16.434f)
                lineTo(11f, 2.756f)
                curveTo(11f, 2.376f, 11.282f, 2.062f, 11.648f, 2.013f)
                lineTo(11.75f, 2.006f)
                lineTo(11.648f, 2.013f)
                close()
            }
        }.build()

        return _ArrowDownload!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownload: ImageVector? = null

@Preview
@Composable
private fun ArrowDownloadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowDownload, contentDescription = null)
    }
}
