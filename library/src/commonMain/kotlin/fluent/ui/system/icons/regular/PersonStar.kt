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

public val FluentIcons.Regular.PersonStar: ImageVector
    get() {
        if (_PersonStar != null) {
            return _PersonStar!!
        }
        _PersonStar = ImageVector.Builder(
            name = "Regular.PersonStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.314f, 15.499f)
                curveTo(11.486f, 14.966f, 11.726f, 14.462f, 12.022f, 13.999f)
                horizontalLineTo(5.253f)
                curveTo(4.011f, 13.999f, 3.004f, 15.006f, 3.004f, 16.248f)
                verticalLineTo(16.826f)
                curveTo(3.004f, 17.719f, 3.322f, 18.582f, 3.902f, 19.261f)
                curveTo(5.468f, 21.095f, 7.854f, 22f, 11f, 22f)
                curveTo(11.6f, 22f, 12.173f, 21.967f, 12.717f, 21.901f)
                curveTo(12.326f, 21.477f, 11.991f, 21f, 11.723f, 20.482f)
                curveTo(11.488f, 20.494f, 11.248f, 20.5f, 11f, 20.5f)
                curveTo(8.262f, 20.5f, 6.296f, 19.755f, 5.043f, 18.287f)
                curveTo(4.695f, 17.879f, 4.504f, 17.361f, 4.504f, 16.826f)
                verticalLineTo(16.248f)
                curveTo(4.504f, 15.835f, 4.839f, 15.499f, 5.253f, 15.499f)
                horizontalLineTo(11.314f)
                close()
                moveTo(11f, 2.004f)
                curveTo(13.762f, 2.004f, 16f, 4.242f, 16f, 7.004f)
                curveTo(16f, 9.765f, 13.762f, 12.004f, 11f, 12.004f)
                curveTo(8.239f, 12.004f, 6f, 9.765f, 6f, 7.004f)
                curveTo(6f, 4.242f, 8.239f, 2.004f, 11f, 2.004f)
                close()
                moveTo(11f, 3.504f)
                curveTo(9.067f, 3.504f, 7.5f, 5.071f, 7.5f, 7.004f)
                curveTo(7.5f, 8.937f, 9.067f, 10.504f, 11f, 10.504f)
                curveTo(12.933f, 10.504f, 14.5f, 8.937f, 14.5f, 7.004f)
                curveTo(14.5f, 5.071f, 12.933f, 3.504f, 11f, 3.504f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(18.055f, 14.421f)
                curveTo(17.881f, 13.86f, 17.119f, 13.86f, 16.945f, 14.421f)
                lineTo(16.388f, 16.208f)
                horizontalLineTo(14.585f)
                curveTo(14.019f, 16.208f, 13.784f, 16.962f, 14.242f, 17.309f)
                lineTo(15.7f, 18.413f)
                lineTo(15.143f, 20.2f)
                curveTo(14.968f, 20.761f, 15.584f, 21.228f, 16.042f, 20.881f)
                lineTo(17.5f, 19.777f)
                lineTo(18.958f, 20.881f)
                curveTo(19.416f, 21.228f, 20.032f, 20.761f, 19.857f, 20.2f)
                lineTo(19.3f, 18.413f)
                lineTo(20.758f, 17.309f)
                curveTo(21.216f, 16.962f, 20.981f, 16.208f, 20.415f, 16.208f)
                horizontalLineTo(18.612f)
                lineTo(18.055f, 14.421f)
                close()
            }
        }.build()

        return _PersonStar!!
    }

@Suppress("ObjectPropertyName")
private var _PersonStar: ImageVector? = null

@Preview
@Composable
private fun PersonStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonStar, contentDescription = null)
    }
}
