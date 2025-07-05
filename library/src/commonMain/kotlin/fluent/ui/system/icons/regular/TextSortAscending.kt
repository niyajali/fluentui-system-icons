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
 * TextSortAscending Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_sort_ascending_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextSortAscending icon.
 */
public val FluentIcons.Regular.TextSortAscending: ImageVector
    get() {
        if (_textSortAscending != null) {
            return _textSortAscending!!
        }
        _textSortAscending = Builder(name = "TextSortAscending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.25f, 2.0f)
                curveTo(17.664f, 2.0f, 18.0f, 2.336f, 18.0f, 2.75f)
                verticalLineTo(19.439f)
                lineTo(20.22f, 17.22f)
                curveTo(20.513f, 16.927f, 20.987f, 16.927f, 21.28f, 17.22f)
                curveTo(21.573f, 17.513f, 21.573f, 17.987f, 21.28f, 18.28f)
                lineTo(17.78f, 21.78f)
                curveTo(17.487f, 22.073f, 17.013f, 22.073f, 16.72f, 21.78f)
                lineTo(13.22f, 18.28f)
                curveTo(12.927f, 17.987f, 12.927f, 17.513f, 13.22f, 17.22f)
                curveTo(13.513f, 16.927f, 13.987f, 16.927f, 14.28f, 17.22f)
                lineTo(16.5f, 19.439f)
                verticalLineTo(2.75f)
                curveTo(16.5f, 2.336f, 16.836f, 2.0f, 17.25f, 2.0f)
                close()
                moveTo(7.769f, 2.487f)
                curveTo(7.66f, 2.196f, 7.383f, 2.002f, 7.072f, 2.0f)
                curveTo(6.761f, 1.998f, 6.481f, 2.188f, 6.368f, 2.477f)
                lineTo(3.052f, 10.977f)
                curveTo(2.901f, 11.363f, 3.092f, 11.798f, 3.478f, 11.949f)
                curveTo(3.863f, 12.099f, 4.298f, 11.908f, 4.449f, 11.523f)
                lineTo(5.238f, 9.5f)
                horizontalLineTo(8.794f)
                lineTo(9.548f, 11.513f)
                curveTo(9.693f, 11.901f, 10.125f, 12.097f, 10.513f, 11.952f)
                curveTo(10.901f, 11.807f, 11.098f, 11.375f, 10.953f, 10.987f)
                lineTo(7.769f, 2.487f)
                close()
                moveTo(5.823f, 8.0f)
                lineTo(7.052f, 4.85f)
                lineTo(8.232f, 8.0f)
                horizontalLineTo(5.823f)
                close()
                moveTo(4.0f, 13.75f)
                curveTo(4.0f, 13.335f, 4.336f, 13.0f, 4.75f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.774f, 13.0f, 10.026f, 13.149f, 10.158f, 13.388f)
                curveTo(10.289f, 13.628f, 10.28f, 13.92f, 10.134f, 14.151f)
                lineTo(6.113f, 20.5f)
                horizontalLineTo(9.5f)
                curveTo(9.915f, 20.5f, 10.25f, 20.836f, 10.25f, 21.25f)
                curveTo(10.25f, 21.664f, 9.915f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(4.75f)
                curveTo(4.477f, 22.0f, 4.225f, 21.851f, 4.093f, 21.611f)
                curveTo(3.962f, 21.372f, 3.971f, 21.08f, 4.117f, 20.848f)
                lineTo(8.138f, 14.5f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 14.5f, 4.0f, 14.164f, 4.0f, 13.75f)
                close()
            }
        }
        .build()
        return _textSortAscending!!
    }

@Suppress("ObjectPropertyName")
private var _textSortAscending: ImageVector? = null

@Preview
@Composable
private fun TextSortAscendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextSortAscending, contentDescription = "TextSortAscending Icon")
    }
}

