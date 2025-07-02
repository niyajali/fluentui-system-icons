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
 * AnimalRabbitOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: animal, rabbit, off
 * - Source: ic_fluent_animal_rabbit_off_20_filled.svg
 * 
 * @return The [ImageVector] for the AnimalRabbitOff icon.
 */
public val FluentIcons.Filled.AnimalRabbitOff: ImageVector
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
                curveTo(6.859f, 8.035f, 6.437f, 8.137f, 6.053f, 8.304f)
                curveTo(5.735f, 7.532f, 4.976f, 6.988f, 4.09f, 6.988f)
                curveTo(2.918f, 6.988f, 1.969f, 7.938f, 1.969f, 9.109f)
                curveTo(1.969f, 10.252f, 2.873f, 11.184f, 4.005f, 11.229f)
                curveTo(4.002f, 11.287f, 4.0f, 11.347f, 4.0f, 11.406f)
                lineTo(4.0f, 13.439f)
                curveTo(4.0f, 14.299f, 4.698f, 14.997f, 5.559f, 14.997f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.75f)
                curveTo(10.0f, 13.591f, 9.917f, 13.414f, 9.719f, 13.26f)
                curveTo(9.52f, 13.106f, 9.23f, 13.0f, 8.903f, 13.0f)
                horizontalLineTo(7.501f)
                curveTo(7.225f, 13.0f, 7.001f, 12.776f, 7.001f, 12.5f)
                curveTo(7.001f, 12.224f, 7.225f, 12.0f, 7.501f, 12.0f)
                horizontalLineTo(8.903f)
                curveTo(9.438f, 12.0f, 9.946f, 12.172f, 10.331f, 12.469f)
                curveTo(10.716f, 12.767f, 11.0f, 13.215f, 11.0f, 13.75f)
                verticalLineTo(14.997f)
                horizontalLineTo(12.743f)
                curveTo(13.17f, 14.997f, 13.557f, 14.825f, 13.839f, 14.546f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(16.907f, 12.54f)
                curveTo(16.489f, 12.958f, 15.972f, 13.215f, 15.432f, 13.311f)
                lineTo(10.125f, 8.004f)
                horizontalLineTo(10.804f)
                curveTo(11.275f, 8.004f, 11.723f, 8.096f, 12.133f, 8.264f)
                curveTo(12.158f, 8.222f, 12.184f, 8.177f, 12.211f, 8.13f)
                curveTo(12.32f, 7.94f, 12.443f, 7.726f, 12.589f, 7.576f)
                lineTo(11.036f, 6.024f)
                curveTo(10.583f, 5.571f, 10.583f, 4.836f, 11.036f, 4.383f)
                curveTo(11.489f, 3.93f, 12.224f, 3.93f, 12.677f, 4.383f)
                lineTo(16.907f, 8.612f)
                curveTo(17.992f, 9.697f, 17.992f, 11.456f, 16.907f, 12.54f)
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
        Image(imageVector = FluentIcons.Filled.AnimalRabbitOff, contentDescription = null)
    }
}

