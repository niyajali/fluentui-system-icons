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

public val FluentIcons.Filled.TextGrammarWand: ImageVector
    get() {
        if (_TextGrammarWand != null) {
            return _TextGrammarWand!!
        }
        _TextGrammarWand = ImageVector.Builder(
            name = "Filled.TextGrammarWand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 17f)
                horizontalLineTo(10.522f)
                lineTo(8.522f, 19f)
                horizontalLineTo(3f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                curveTo(2f, 17.487f, 2.386f, 17.065f, 2.883f, 17.007f)
                lineTo(3f, 17f)
                close()
                moveTo(3f, 15f)
                horizontalLineTo(10.848f)
                curveTo(10.336f, 14.692f, 10f, 14.131f, 10f, 13.5f)
                curveTo(10f, 13.327f, 10.025f, 13.159f, 10.073f, 13f)
                horizontalLineTo(3f)
                lineTo(2.883f, 13.007f)
                curveTo(2.386f, 13.064f, 2f, 13.487f, 2f, 14f)
                curveTo(2f, 14.552f, 2.448f, 15f, 3f, 15f)
                close()
                moveTo(3f, 7f)
                horizontalLineTo(21f)
                lineTo(21.117f, 6.993f)
                curveTo(21.614f, 6.936f, 22f, 6.513f, 22f, 6f)
                curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
                horizontalLineTo(3f)
                lineTo(2.883f, 5.007f)
                curveTo(2.386f, 5.064f, 2f, 5.487f, 2f, 6f)
                curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
                close()
                moveTo(12.72f, 16.216f)
                curveTo(13.013f, 15.923f, 13.487f, 15.923f, 13.78f, 16.216f)
                curveTo(14.073f, 16.509f, 14.073f, 16.984f, 13.78f, 17.277f)
                lineTo(9.28f, 21.777f)
                curveTo(8.987f, 22.07f, 8.513f, 22.07f, 8.22f, 21.777f)
                curveTo(7.927f, 21.484f, 7.927f, 21.009f, 8.22f, 20.716f)
                lineTo(12.72f, 16.216f)
                close()
                moveTo(3f, 9f)
                horizontalLineTo(13f)
                curveTo(13.552f, 9f, 14f, 9.448f, 14f, 10f)
                curveTo(14f, 10.513f, 13.614f, 10.936f, 13.117f, 10.993f)
                lineTo(13f, 11f)
                horizontalLineTo(3f)
                curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
                curveTo(2f, 9.487f, 2.386f, 9.064f, 2.883f, 9.007f)
                lineTo(3f, 9f)
                close()
                moveTo(16.5f, 8f)
                curveTo(16.879f, 8f, 17.198f, 8.282f, 17.244f, 8.658f)
                lineTo(17.383f, 9.788f)
                curveTo(17.566f, 11.268f, 18.732f, 12.434f, 20.212f, 12.617f)
                lineTo(21.342f, 12.756f)
                curveTo(21.718f, 12.802f, 22f, 13.121f, 22f, 13.5f)
                curveTo(22f, 13.879f, 21.718f, 14.198f, 21.342f, 14.244f)
                lineTo(20.212f, 14.383f)
                curveTo(18.732f, 14.566f, 17.566f, 15.732f, 17.383f, 17.212f)
                lineTo(17.244f, 18.342f)
                curveTo(17.198f, 18.718f, 16.879f, 19f, 16.5f, 19f)
                curveTo(16.121f, 19f, 15.802f, 18.718f, 15.756f, 18.342f)
                lineTo(15.617f, 17.212f)
                curveTo(15.434f, 15.732f, 14.268f, 14.566f, 12.788f, 14.383f)
                lineTo(11.658f, 14.244f)
                curveTo(11.282f, 14.198f, 11f, 13.879f, 11f, 13.5f)
                curveTo(11f, 13.121f, 11.282f, 12.802f, 11.658f, 12.756f)
                lineTo(12.788f, 12.617f)
                curveTo(14.268f, 12.434f, 15.434f, 11.268f, 15.617f, 9.788f)
                lineTo(15.756f, 8.658f)
                curveTo(15.802f, 8.282f, 16.121f, 8f, 16.5f, 8f)
                close()
            }
        }.build()

        return _TextGrammarWand!!
    }

@Suppress("ObjectPropertyName")
private var _TextGrammarWand: ImageVector? = null

@Preview
@Composable
private fun TextGrammarWandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextGrammarWand, contentDescription = null)
    }
}
