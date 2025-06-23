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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.TextboxMore: ImageVector
    get() {
        if (_TextboxMore != null) {
            return _TextboxMore!!
        }
        _TextboxMore = ImageVector.Builder(
            name = "Filled.TextboxMore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.25f, 3f)
                curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
                verticalLineTo(18.05f)
                curveTo(20.838f, 18.017f, 20.671f, 18f, 20.5f, 18f)
                curveTo(19.308f, 18f, 18.311f, 18.834f, 18.06f, 19.951f)
                curveTo(18.054f, 19.979f, 18.029f, 20f, 18f, 20f)
                curveTo(17.971f, 20f, 17.946f, 19.979f, 17.94f, 19.951f)
                curveTo(17.689f, 18.834f, 16.692f, 18f, 15.5f, 18f)
                curveTo(14.308f, 18f, 13.311f, 18.834f, 13.061f, 19.951f)
                curveTo(13.054f, 19.979f, 13.029f, 20f, 13f, 20f)
                curveTo(12.971f, 20f, 12.946f, 19.979f, 12.939f, 19.951f)
                curveTo(12.689f, 18.834f, 11.692f, 18f, 10.5f, 18f)
                curveTo(9.119f, 18f, 8f, 19.119f, 8f, 20.5f)
                curveTo(8f, 20.671f, 8.017f, 20.838f, 8.05f, 21f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                horizontalLineTo(18.25f)
                close()
                moveTo(15f, 12.25f)
                curveTo(15f, 11.836f, 14.664f, 11.5f, 14.25f, 11.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 11.507f)
                curveTo(6.282f, 11.557f, 6f, 11.87f, 6f, 12.25f)
                curveTo(6f, 12.664f, 6.336f, 13f, 6.75f, 13f)
                horizontalLineTo(14.25f)
                lineTo(14.352f, 12.993f)
                curveTo(14.718f, 12.943f, 15f, 12.63f, 15f, 12.25f)
                close()
                moveTo(17.25f, 15.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 15.507f)
                curveTo(6.282f, 15.557f, 6f, 15.87f, 6f, 16.25f)
                curveTo(6f, 16.664f, 6.336f, 17f, 6.75f, 17f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 16.993f)
                curveTo(17.718f, 16.944f, 18f, 16.63f, 18f, 16.25f)
                curveTo(18f, 15.836f, 17.664f, 15.5f, 17.25f, 15.5f)
                close()
                moveTo(18f, 8.25f)
                curveTo(18f, 7.836f, 17.664f, 7.5f, 17.25f, 7.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 7.507f)
                curveTo(6.282f, 7.557f, 6f, 7.87f, 6f, 8.25f)
                curveTo(6f, 8.664f, 6.336f, 9f, 6.75f, 9f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 8.993f)
                curveTo(17.718f, 8.943f, 18f, 8.63f, 18f, 8.25f)
                close()
                moveTo(12f, 20.5f)
                curveTo(12f, 21.328f, 11.328f, 22f, 10.5f, 22f)
                curveTo(9.672f, 22f, 9f, 21.328f, 9f, 20.5f)
                curveTo(9f, 19.672f, 9.672f, 19f, 10.5f, 19f)
                curveTo(11.328f, 19f, 12f, 19.672f, 12f, 20.5f)
                close()
                moveTo(15.5f, 22f)
                curveTo(16.328f, 22f, 17f, 21.328f, 17f, 20.5f)
                curveTo(17f, 19.672f, 16.328f, 19f, 15.5f, 19f)
                curveTo(14.672f, 19f, 14f, 19.672f, 14f, 20.5f)
                curveTo(14f, 21.328f, 14.672f, 22f, 15.5f, 22f)
                close()
                moveTo(20.5f, 22f)
                curveTo(21.328f, 22f, 22f, 21.328f, 22f, 20.5f)
                curveTo(22f, 19.672f, 21.328f, 19f, 20.5f, 19f)
                curveTo(19.672f, 19f, 19f, 19.672f, 19f, 20.5f)
                curveTo(19f, 21.328f, 19.672f, 22f, 20.5f, 22f)
                close()
            }
        }.build()

        return _TextboxMore!!
    }

@Suppress("ObjectPropertyName")
private var _TextboxMore: ImageVector? = null

@Preview
@Composable
private fun TextboxMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextboxMore, contentDescription = null)
    }
}
