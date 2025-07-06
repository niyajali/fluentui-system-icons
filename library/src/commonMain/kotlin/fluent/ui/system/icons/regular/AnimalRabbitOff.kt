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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * AnimalRabbitOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent cruelty free practices and events.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_animal_rabbit_off_20_regular.svg)
 * 
 * @return The [ImageVector] for the AnimalRabbitOff icon.
 */
public val FluentIcons.Regular.AnimalRabbitOff: ImageVector
    get() {
        if (_animalRabbitOff != null) {
            return _animalRabbitOff!!
        }
        _animalRabbitOff = Builder(name = "AnimalRabbitOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(7.303f, 8.01f)
                curveTo(7.058f, 8.026f, 6.821f, 8.067f, 6.592f, 8.13f)
                curveTo(6.146f, 7.449f, 5.375f, 6.999f, 4.5f, 6.999f)
                curveTo(3.119f, 6.999f, 2.0f, 8.119f, 2.0f, 9.499f)
                curveTo(2.0f, 10.709f, 2.859f, 11.718f, 4.0f, 11.949f)
                verticalLineTo(12.883f)
                curveTo(4.0f, 14.057f, 4.948f, 15.01f, 6.122f, 15.01f)
                horizontalLineTo(10.506f)
                lineTo(10.509f, 15.01f)
                lineTo(10.512f, 15.01f)
                horizontalLineTo(12.635f)
                curveTo(13.105f, 15.01f, 13.539f, 14.857f, 13.891f, 14.598f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(13.168f, 13.875f)
                curveTo(13.009f, 13.961f, 12.828f, 14.01f, 12.635f, 14.01f)
                horizontalLineTo(11.009f)
                verticalLineTo(13.91f)
                curveTo(11.009f, 12.783f, 9.989f, 11.999f, 8.887f, 11.999f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 11.999f, 7.0f, 12.223f, 7.0f, 12.499f)
                curveTo(7.0f, 12.775f, 7.224f, 12.999f, 7.5f, 12.999f)
                horizontalLineTo(8.887f)
                curveTo(9.576f, 12.999f, 10.009f, 13.465f, 10.009f, 13.91f)
                verticalLineTo(14.01f)
                horizontalLineTo(6.122f)
                curveTo(5.504f, 14.01f, 5.0f, 13.507f, 5.0f, 12.883f)
                verticalLineTo(11.552f)
                curveTo(5.0f, 10.142f, 6.139f, 9.002f, 7.541f, 9.002f)
                horizontalLineTo(8.295f)
                lineTo(13.168f, 13.875f)
                close()
                moveTo(5.657f, 8.545f)
                curveTo(4.828f, 9.069f, 4.23f, 9.928f, 4.054f, 10.932f)
                curveTo(3.443f, 10.742f, 3.0f, 10.172f, 3.0f, 9.499f)
                curveTo(3.0f, 8.671f, 3.672f, 7.999f, 4.5f, 7.999f)
                curveTo(4.966f, 7.999f, 5.382f, 8.212f, 5.657f, 8.545f)
                close()
                moveTo(16.374f, 12.025f)
                curveTo(15.934f, 12.467f, 15.349f, 12.676f, 14.772f, 12.651f)
                lineTo(15.669f, 13.548f)
                curveTo(16.187f, 13.411f, 16.676f, 13.139f, 17.082f, 12.731f)
                curveTo(18.306f, 11.504f, 18.306f, 9.514f, 17.082f, 8.287f)
                lineTo(12.863f, 4.074f)
                curveTo(12.271f, 3.48f, 11.311f, 3.481f, 10.719f, 4.074f)
                curveTo(10.128f, 4.667f, 10.128f, 5.628f, 10.719f, 6.221f)
                lineTo(12.061f, 7.552f)
                curveTo(11.938f, 7.715f, 11.837f, 7.885f, 11.754f, 8.043f)
                curveTo(11.578f, 8.016f, 11.399f, 8.002f, 11.216f, 8.002f)
                horizontalLineTo(10.123f)
                lineTo(11.123f, 9.002f)
                horizontalLineTo(11.216f)
                curveTo(11.454f, 9.002f, 11.684f, 9.035f, 11.902f, 9.096f)
                lineTo(12.325f, 9.215f)
                lineTo(12.497f, 8.811f)
                curveTo(12.608f, 8.551f, 12.762f, 8.244f, 12.969f, 8.023f)
                lineTo(13.472f, 7.541f)
                lineTo(11.427f, 5.515f)
                lineTo(11.426f, 5.514f)
                curveTo(11.225f, 5.311f, 11.225f, 4.983f, 11.427f, 4.78f)
                curveTo(11.628f, 4.578f, 11.954f, 4.578f, 12.155f, 4.78f)
                lineTo(12.156f, 4.781f)
                lineTo(16.375f, 8.993f)
                curveTo(17.209f, 9.83f, 17.208f, 11.188f, 16.374f, 12.025f)
                close()
            }
        }
        .build()
        return _animalRabbitOff!!
    }

@Suppress("ObjectPropertyName")
private var _animalRabbitOff: ImageVector? = null

@Preview
@Composable
private fun AnimalRabbitOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AnimalRabbitOff, contentDescription = "AnimalRabbitOff Icon")
    }
}

