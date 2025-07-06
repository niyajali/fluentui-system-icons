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
 * TextDirectionVertical Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to choose text direction in editor scenarios. Contains directional, rotation and locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_direction_vertical_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextDirectionVertical icon.
 */
public val FluentIcons.Regular.TextDirectionVertical: ImageVector
    get() {
        if (_textDirectionVertical != null) {
            return _textDirectionVertical!!
        }
        _textDirectionVertical = Builder(name = "TextDirectionVertical", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.75f)
                curveTo(6.0f, 3.336f, 6.336f, 3.0f, 6.75f, 3.0f)
                curveTo(7.164f, 3.0f, 7.5f, 3.336f, 7.5f, 3.75f)
                verticalLineTo(18.439f)
                lineTo(8.22f, 17.72f)
                curveTo(8.513f, 17.427f, 8.987f, 17.427f, 9.28f, 17.72f)
                curveTo(9.573f, 18.013f, 9.573f, 18.487f, 9.28f, 18.78f)
                lineTo(7.28f, 20.78f)
                curveTo(6.987f, 21.073f, 6.513f, 21.073f, 6.22f, 20.78f)
                lineTo(4.22f, 18.78f)
                curveTo(3.927f, 18.487f, 3.927f, 18.013f, 4.22f, 17.72f)
                curveTo(4.513f, 17.427f, 4.987f, 17.427f, 5.28f, 17.72f)
                lineTo(6.0f, 18.439f)
                verticalLineTo(3.75f)
                close()
                moveTo(11.553f, 12.969f)
                lineTo(15.306f, 3.474f)
                curveTo(15.542f, 2.879f, 16.349f, 2.844f, 16.651f, 3.37f)
                lineTo(16.701f, 3.475f)
                lineTo(20.448f, 12.975f)
                curveTo(20.6f, 13.361f, 20.411f, 13.796f, 20.025f, 13.948f)
                curveTo(19.672f, 14.087f, 19.277f, 13.94f, 19.096f, 13.618f)
                lineTo(19.052f, 13.526f)
                lineTo(18.056f, 11.0f)
                horizontalLineTo(13.943f)
                lineTo(12.948f, 13.521f)
                curveTo(12.808f, 13.874f, 12.43f, 14.062f, 12.072f, 13.974f)
                lineTo(11.974f, 13.943f)
                curveTo(11.621f, 13.803f, 11.433f, 13.425f, 11.522f, 13.067f)
                lineTo(11.553f, 12.969f)
                close()
                moveTo(16.003f, 5.792f)
                lineTo(14.536f, 9.5f)
                horizontalLineTo(17.464f)
                lineTo(16.003f, 5.792f)
                close()
                moveTo(16.25f, 14.0f)
                curveTo(15.836f, 14.0f, 15.5f, 14.336f, 15.5f, 14.75f)
                verticalLineTo(18.439f)
                lineTo(14.78f, 17.72f)
                curveTo(14.487f, 17.427f, 14.013f, 17.427f, 13.72f, 17.72f)
                curveTo(13.427f, 18.013f, 13.427f, 18.487f, 13.72f, 18.78f)
                lineTo(15.72f, 20.78f)
                curveTo(16.013f, 21.073f, 16.487f, 21.073f, 16.78f, 20.78f)
                lineTo(18.78f, 18.78f)
                curveTo(19.073f, 18.487f, 19.073f, 18.013f, 18.78f, 17.72f)
                curveTo(18.487f, 17.427f, 18.013f, 17.427f, 17.72f, 17.72f)
                lineTo(17.0f, 18.439f)
                verticalLineTo(14.75f)
                curveTo(17.0f, 14.336f, 16.664f, 14.0f, 16.25f, 14.0f)
                close()
            }
        }
        .build()
        return _textDirectionVertical!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionVertical: ImageVector? = null

@Preview
@Composable
private fun TextDirectionVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDirectionVertical, contentDescription = "TextDirectionVertical Icon")
    }
}

