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

public val FluentIcons.Regular.ArrowExportRtl: ImageVector
    get() {
        if (_ArrowExportRtl != null) {
            return _ArrowExportRtl!!
        }
        _ArrowExportRtl = ImageVector.Builder(
            name = "Regular.ArrowExportRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.244f, 4.5f)
                curveTo(20.864f, 4.5f, 20.55f, 4.782f, 20.501f, 5.148f)
                lineTo(20.494f, 5.25f)
                lineTo(20.496f, 18.254f)
                curveTo(20.496f, 18.668f, 20.832f, 19.004f, 21.246f, 19.004f)
                curveTo(21.626f, 19.004f, 21.94f, 18.722f, 21.989f, 18.356f)
                lineTo(21.996f, 18.254f)
                lineTo(21.994f, 5.25f)
                curveTo(21.994f, 4.836f, 21.658f, 4.5f, 21.244f, 4.5f)
                close()
                moveTo(8.349f, 6.304f)
                lineTo(8.276f, 6.22f)
                curveTo(8.01f, 5.953f, 7.593f, 5.929f, 7.3f, 6.147f)
                lineTo(7.216f, 6.22f)
                lineTo(2.219f, 11.217f)
                curveTo(1.953f, 11.483f, 1.929f, 11.9f, 2.146f, 12.193f)
                lineTo(2.219f, 12.278f)
                lineTo(7.215f, 17.281f)
                curveTo(7.508f, 17.574f, 7.983f, 17.574f, 8.276f, 17.282f)
                curveTo(8.543f, 17.016f, 8.567f, 16.599f, 8.349f, 16.305f)
                lineTo(8.277f, 16.221f)
                lineTo(4.566f, 12.504f)
                lineTo(18.243f, 12.505f)
                curveTo(18.623f, 12.505f, 18.937f, 12.223f, 18.986f, 11.857f)
                lineTo(18.993f, 11.755f)
                curveTo(18.993f, 11.375f, 18.711f, 11.061f, 18.345f, 11.012f)
                lineTo(18.243f, 11.005f)
                lineTo(4.553f, 11.004f)
                lineTo(8.276f, 7.28f)
                curveTo(8.543f, 7.014f, 8.567f, 6.597f, 8.349f, 6.304f)
                lineTo(8.276f, 6.22f)
                lineTo(8.349f, 6.304f)
                close()
            }
        }.build()

        return _ArrowExportRtl!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExportRtl: ImageVector? = null

@Preview
@Composable
private fun ArrowExportRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowExportRtl, contentDescription = null)
    }
}
