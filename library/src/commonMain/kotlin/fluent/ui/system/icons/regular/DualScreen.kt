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

public val FluentIcons.Regular.DualScreen: ImageVector
    get() {
        if (_DualScreen != null) {
            return _DualScreen!!
        }
        _DualScreen = ImageVector.Builder(
            name = "Regular.DualScreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.748f, 4f)
                lineTo(12.747f, 4.002f)
                lineTo(20.245f, 4.002f)
                curveTo(21.212f, 4.002f, 21.995f, 4.786f, 21.995f, 5.752f)
                verticalLineTo(18.248f)
                curveTo(21.995f, 19.214f, 21.212f, 19.998f, 20.245f, 19.998f)
                horizontalLineTo(11.248f)
                lineTo(11.247f, 19.995f)
                lineTo(3.75f, 19.995f)
                curveTo(2.783f, 19.995f, 2f, 19.212f, 2f, 18.245f)
                verticalLineTo(5.75f)
                curveTo(2f, 4.784f, 2.783f, 4f, 3.75f, 4f)
                horizontalLineTo(12.748f)
                close()
                moveTo(20.245f, 5.502f)
                horizontalLineTo(12.748f)
                verticalLineTo(18.498f)
                horizontalLineTo(20.245f)
                curveTo(20.383f, 18.498f, 20.495f, 18.386f, 20.495f, 18.248f)
                verticalLineTo(5.752f)
                curveTo(20.495f, 5.614f, 20.383f, 5.502f, 20.245f, 5.502f)
                close()
                moveTo(11.248f, 5.5f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 5.5f, 3.5f, 5.612f, 3.5f, 5.75f)
                verticalLineTo(18.245f)
                curveTo(3.5f, 18.383f, 3.612f, 18.495f, 3.75f, 18.495f)
                horizontalLineTo(11.248f)
                verticalLineTo(5.5f)
                close()
                moveTo(14.739f, 15.499f)
                horizontalLineTo(16.239f)
                curveTo(16.653f, 15.499f, 16.989f, 15.835f, 16.989f, 16.249f)
                curveTo(16.989f, 16.628f, 16.707f, 16.942f, 16.34f, 16.992f)
                lineTo(16.239f, 16.999f)
                horizontalLineTo(14.739f)
                curveTo(14.325f, 16.999f, 13.989f, 16.663f, 13.989f, 16.249f)
                curveTo(13.989f, 15.869f, 14.271f, 15.555f, 14.637f, 15.506f)
                lineTo(14.739f, 15.499f)
                horizontalLineTo(16.239f)
                horizontalLineTo(14.739f)
                close()
                moveTo(7.741f, 15.499f)
                horizontalLineTo(9.243f)
                curveTo(9.657f, 15.499f, 9.993f, 15.835f, 9.993f, 16.249f)
                curveTo(9.993f, 16.628f, 9.711f, 16.942f, 9.345f, 16.992f)
                lineTo(9.243f, 16.999f)
                horizontalLineTo(7.741f)
                curveTo(7.327f, 16.999f, 6.991f, 16.663f, 6.991f, 16.249f)
                curveTo(6.991f, 15.869f, 7.273f, 15.555f, 7.639f, 15.506f)
                lineTo(7.741f, 15.499f)
                horizontalLineTo(9.243f)
                horizontalLineTo(7.741f)
                close()
            }
        }.build()

        return _DualScreen!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreen: ImageVector? = null

@Preview
@Composable
private fun DualScreenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreen, contentDescription = null)
    }
}
