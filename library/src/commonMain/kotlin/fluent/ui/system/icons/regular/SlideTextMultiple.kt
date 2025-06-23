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

public val FluentIcons.Regular.SlideTextMultiple: ImageVector
    get() {
        if (_SlideTextMultiple != null) {
            return _SlideTextMultiple!!
        }
        _SlideTextMultiple = ImageVector.Builder(
            name = "Regular.SlideTextMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 7.5f)
                curveTo(6.336f, 7.5f, 6f, 7.836f, 6f, 8.25f)
                curveTo(6f, 8.664f, 6.336f, 9f, 6.75f, 9f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 9f, 11f, 8.664f, 11f, 8.25f)
                curveTo(11f, 7.836f, 10.664f, 7.5f, 10.25f, 7.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6f, 11.25f)
                curveTo(6f, 10.836f, 6.336f, 10.5f, 6.75f, 10.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 10.5f, 14f, 10.836f, 14f, 11.25f)
                curveTo(14f, 11.664f, 13.664f, 12f, 13.25f, 12f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12f, 6f, 11.664f, 6f, 11.25f)
                close()
                moveTo(6.75f, 13.5f)
                curveTo(6.336f, 13.5f, 6f, 13.836f, 6f, 14.25f)
                curveTo(6f, 14.664f, 6.336f, 15f, 6.75f, 15f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 15f, 12f, 14.664f, 12f, 14.25f)
                curveTo(12f, 13.836f, 11.664f, 13.5f, 11.25f, 13.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(5.25f, 4f)
                horizontalLineTo(16.75f)
                curveTo(18.483f, 4f, 19.899f, 5.356f, 19.995f, 7.066f)
                lineTo(20f, 7.25f)
                verticalLineTo(15.75f)
                curveTo(20f, 17.483f, 18.643f, 18.899f, 16.934f, 18.995f)
                lineTo(16.75f, 19f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 19f, 2.101f, 17.643f, 2.005f, 15.934f)
                lineTo(2f, 15.75f)
                verticalLineTo(7.25f)
                curveTo(2f, 5.517f, 3.356f, 4.101f, 5.066f, 4.005f)
                lineTo(5.25f, 4f)
                close()
                moveTo(3.5f, 7.2f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.668f, 4.207f, 17.421f, 5.106f, 17.494f)
                lineTo(5.25f, 17.5f)
                horizontalLineTo(16.75f)
                curveTo(17.668f, 17.5f, 18.421f, 16.793f, 18.494f, 15.894f)
                lineTo(18.5f, 15.75f)
                lineTo(18.499f, 7.2f)
                curveTo(18.473f, 6.257f, 17.7f, 5.5f, 16.75f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.332f, 5.5f, 3.579f, 6.207f, 3.506f, 7.106f)
                lineTo(3.502f, 7.2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(21f, 7.511f)
                curveTo(21.902f, 8.089f, 22.5f, 9.1f, 22.5f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(22.5f, 19.149f, 20.149f, 21.5f, 17.25f, 21.5f)
                horizontalLineTo(8.25f)
                curveTo(7.1f, 21.5f, 6.089f, 20.902f, 5.511f, 20f)
                lineTo(17.25f, 20f)
                curveTo(19.321f, 20f, 21f, 18.321f, 21f, 16.25f)
                lineTo(21f, 7.511f)
                close()
            }
        }.build()

        return _SlideTextMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _SlideTextMultiple: ImageVector? = null

@Preview
@Composable
private fun SlideTextMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideTextMultiple, contentDescription = null)
    }
}
