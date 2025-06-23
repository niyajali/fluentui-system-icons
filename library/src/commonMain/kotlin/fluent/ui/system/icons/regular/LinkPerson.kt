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

public val FluentIcons.Regular.LinkPerson: ImageVector
    get() {
        if (_LinkPerson != null) {
            return _LinkPerson!!
        }
        _LinkPerson = ImageVector.Builder(
            name = "Regular.LinkPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10f, 5.75f)
                curveTo(10f, 5.336f, 9.664f, 5f, 9.25f, 5f)
                horizontalLineTo(7f)
                lineTo(6.75f, 5.006f)
                curveTo(4.105f, 5.136f, 2f, 7.322f, 2f, 10f)
                curveTo(2f, 12.761f, 4.239f, 15f, 7f, 15f)
                horizontalLineTo(9.25f)
                lineTo(9.361f, 14.992f)
                curveTo(9.722f, 14.938f, 10f, 14.627f, 10f, 14.25f)
                curveTo(10f, 13.836f, 9.664f, 13.5f, 9.25f, 13.5f)
                horizontalLineTo(7f)
                lineTo(6.794f, 13.494f)
                curveTo(4.957f, 13.388f, 3.5f, 11.864f, 3.5f, 10f)
                curveTo(3.5f, 8.067f, 5.067f, 6.5f, 7f, 6.5f)
                horizontalLineTo(9.25f)
                lineTo(9.361f, 6.492f)
                curveTo(9.722f, 6.438f, 10f, 6.127f, 10f, 5.75f)
                close()
                moveTo(22f, 10f)
                curveTo(22f, 7.239f, 19.761f, 5f, 17f, 5f)
                horizontalLineTo(14.75f)
                lineTo(14.639f, 5.008f)
                curveTo(14.278f, 5.062f, 14f, 5.373f, 14f, 5.75f)
                curveTo(14f, 6.164f, 14.336f, 6.5f, 14.75f, 6.5f)
                horizontalLineTo(17f)
                lineTo(17.206f, 6.506f)
                curveTo(19.043f, 6.612f, 20.5f, 8.136f, 20.5f, 10f)
                curveTo(20.5f, 10.724f, 20.28f, 11.397f, 19.903f, 11.955f)
                curveTo(20.288f, 12.319f, 20.59f, 12.769f, 20.779f, 13.274f)
                curveTo(21.54f, 12.397f, 22f, 11.252f, 22f, 10f)
                close()
                moveTo(17f, 9.25f)
                horizontalLineTo(7f)
                lineTo(6.898f, 9.257f)
                curveTo(6.532f, 9.307f, 6.25f, 9.62f, 6.25f, 10f)
                curveTo(6.25f, 10.414f, 6.586f, 10.75f, 7f, 10.75f)
                horizontalLineTo(17f)
                lineTo(17.102f, 10.743f)
                curveTo(17.468f, 10.693f, 17.75f, 10.38f, 17.75f, 10f)
                curveTo(17.75f, 9.586f, 17.414f, 9.25f, 17f, 9.25f)
                close()
                moveTo(20f, 14.5f)
                curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
                curveTo(16.119f, 17f, 15f, 15.881f, 15f, 14.5f)
                curveTo(15f, 13.119f, 16.119f, 12f, 17.5f, 12f)
                curveTo(18.881f, 12f, 20f, 13.119f, 20f, 14.5f)
                close()
                moveTo(22f, 19.875f)
                curveTo(22f, 21.431f, 20.714f, 23f, 17.5f, 23f)
                curveTo(14.286f, 23f, 13f, 21.437f, 13f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(13f, 18.793f, 13.794f, 18f, 14.773f, 18f)
                horizontalLineTo(20.227f)
                curveTo(21.206f, 18f, 22f, 18.793f, 22f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _LinkPerson!!
    }

@Suppress("ObjectPropertyName")
private var _LinkPerson: ImageVector? = null

@Preview
@Composable
private fun LinkPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LinkPerson, contentDescription = null)
    }
}
