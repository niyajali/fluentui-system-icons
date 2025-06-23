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

public val FluentIcons.Regular.LinkMultiple: ImageVector
    get() {
        if (_LinkMultiple != null) {
            return _LinkMultiple!!
        }
        _LinkMultiple = ImageVector.Builder(
            name = "Regular.LinkMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 4f)
                curveTo(3.351f, 4f, 1f, 6.351f, 1f, 9.25f)
                curveTo(1f, 11.553f, 2.483f, 13.51f, 4.547f, 14.217f)
                curveTo(4.608f, 13.708f, 4.728f, 13.216f, 4.9f, 12.75f)
                curveTo(3.496f, 12.208f, 2.5f, 10.845f, 2.5f, 9.25f)
                curveTo(2.5f, 7.179f, 4.179f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(12.75f)
                curveTo(14.821f, 5.5f, 16.5f, 7.179f, 16.5f, 9.25f)
                curveTo(16.5f, 11.321f, 14.821f, 13f, 12.75f, 13f)
                horizontalLineTo(11.75f)
                curveTo(11.336f, 13f, 11f, 13.336f, 11f, 13.75f)
                curveTo(11f, 14.164f, 11.336f, 14.5f, 11.75f, 14.5f)
                horizontalLineTo(12.75f)
                curveTo(15.649f, 14.5f, 18f, 12.149f, 18f, 9.25f)
                curveTo(18f, 6.351f, 15.649f, 4f, 12.75f, 4f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.391f, 10.196f)
                curveTo(19.298f, 10.696f, 19.147f, 11.177f, 18.947f, 11.63f)
                curveTo(20.42f, 12.042f, 21.5f, 13.395f, 21.5f, 15f)
                curveTo(21.5f, 16.933f, 19.933f, 18.5f, 18f, 18.5f)
                horizontalLineTo(11f)
                curveTo(9.067f, 18.5f, 7.5f, 16.933f, 7.5f, 15f)
                curveTo(7.5f, 13.067f, 9.067f, 11.5f, 11f, 11.5f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 11.5f, 13f, 11.164f, 13f, 10.75f)
                curveTo(13f, 10.336f, 12.664f, 10f, 12.25f, 10f)
                horizontalLineTo(11f)
                curveTo(8.239f, 10f, 6f, 12.239f, 6f, 15f)
                curveTo(6f, 17.761f, 8.239f, 20f, 11f, 20f)
                horizontalLineTo(18f)
                curveTo(20.761f, 20f, 23f, 17.761f, 23f, 15f)
                curveTo(23f, 12.721f, 21.476f, 10.798f, 19.391f, 10.196f)
                close()
            }
        }.build()

        return _LinkMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _LinkMultiple: ImageVector? = null

@Preview
@Composable
private fun LinkMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LinkMultiple, contentDescription = null)
    }
}
