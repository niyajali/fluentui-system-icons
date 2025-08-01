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

public val FluentIcons.Regular.LinkAdd: ImageVector
    get() {
        if (_LinkAdd != null) {
            return _LinkAdd!!
        }
        _LinkAdd = ImageVector.Builder(
            name = "Regular.LinkAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.25f, 5f)
                curveTo(9.664f, 5f, 10f, 5.336f, 10f, 5.75f)
                curveTo(10f, 6.127f, 9.722f, 6.438f, 9.361f, 6.492f)
                lineTo(9.25f, 6.5f)
                horizontalLineTo(7f)
                curveTo(5.067f, 6.5f, 3.5f, 8.067f, 3.5f, 10f)
                curveTo(3.5f, 11.864f, 4.957f, 13.388f, 6.794f, 13.494f)
                lineTo(7f, 13.5f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 13.5f, 10f, 13.836f, 10f, 14.25f)
                curveTo(10f, 14.627f, 9.722f, 14.938f, 9.361f, 14.992f)
                lineTo(9.25f, 15f)
                horizontalLineTo(7f)
                curveTo(4.239f, 15f, 2f, 12.761f, 2f, 10f)
                curveTo(2f, 7.322f, 4.105f, 5.136f, 6.75f, 5.006f)
                lineTo(7f, 5f)
                horizontalLineTo(9.25f)
                close()
                moveTo(17f, 5f)
                curveTo(19.761f, 5f, 22f, 7.239f, 22f, 10f)
                curveTo(22f, 10.838f, 21.794f, 11.628f, 21.429f, 12.322f)
                curveTo(21.032f, 12.019f, 20.598f, 11.762f, 20.136f, 11.557f)
                curveTo(20.369f, 11.088f, 20.5f, 10.559f, 20.5f, 10f)
                curveTo(20.5f, 8.136f, 19.043f, 6.612f, 17.206f, 6.506f)
                lineTo(17f, 6.5f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 6.5f, 14f, 6.164f, 14f, 5.75f)
                curveTo(14f, 5.373f, 14.278f, 5.062f, 14.639f, 5.008f)
                lineTo(14.75f, 5f)
                horizontalLineTo(17f)
                close()
                moveTo(7f, 9.25f)
                horizontalLineTo(17f)
                curveTo(17.414f, 9.25f, 17.75f, 9.586f, 17.75f, 10f)
                curveTo(17.75f, 10.38f, 17.468f, 10.693f, 17.102f, 10.743f)
                lineTo(17f, 10.75f)
                horizontalLineTo(7f)
                curveTo(6.586f, 10.75f, 6.25f, 10.414f, 6.25f, 10f)
                curveTo(6.25f, 9.62f, 6.532f, 9.307f, 6.898f, 9.257f)
                lineTo(7f, 9.25f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _LinkAdd!!
    }

@Suppress("ObjectPropertyName")
private var _LinkAdd: ImageVector? = null

@Preview
@Composable
private fun LinkAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LinkAdd, contentDescription = null)
    }
}
