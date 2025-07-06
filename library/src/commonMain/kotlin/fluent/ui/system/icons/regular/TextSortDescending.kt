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
 * TextSortDescending Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_sort_descending_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextSortDescending icon.
 */
public val FluentIcons.Regular.TextSortDescending: ImageVector
    get() {
        if (_textSortDescending != null) {
            return _textSortDescending!!
        }
        _textSortDescending = Builder(name = "TextSortDescending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 2.75f)
                curveTo(4.0f, 2.336f, 4.336f, 2.0f, 4.75f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(9.773f, 2.0f, 10.025f, 2.149f, 10.157f, 2.388f)
                curveTo(10.289f, 2.628f, 10.28f, 2.92f, 10.134f, 3.151f)
                lineTo(6.113f, 9.5f)
                horizontalLineTo(9.5f)
                curveTo(9.914f, 9.5f, 10.25f, 9.836f, 10.25f, 10.25f)
                curveTo(10.25f, 10.664f, 9.914f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(4.75f)
                curveTo(4.477f, 11.0f, 4.225f, 10.851f, 4.093f, 10.612f)
                curveTo(3.961f, 10.372f, 3.97f, 10.08f, 4.116f, 9.849f)
                lineTo(8.137f, 3.5f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 3.5f, 4.0f, 3.164f, 4.0f, 2.75f)
                close()
                moveTo(6.368f, 12.477f)
                curveTo(6.481f, 12.188f, 6.761f, 11.998f, 7.072f, 12.0f)
                curveTo(7.383f, 12.002f, 7.66f, 12.196f, 7.769f, 12.487f)
                lineTo(10.953f, 20.987f)
                curveTo(11.098f, 21.375f, 10.901f, 21.807f, 10.513f, 21.952f)
                curveTo(10.125f, 22.097f, 9.693f, 21.901f, 9.548f, 21.513f)
                lineTo(8.794f, 19.5f)
                horizontalLineTo(5.238f)
                lineTo(4.449f, 21.522f)
                curveTo(4.298f, 21.908f, 3.863f, 22.099f, 3.478f, 21.948f)
                curveTo(3.092f, 21.798f, 2.901f, 21.363f, 3.052f, 20.977f)
                lineTo(6.368f, 12.477f)
                close()
                moveTo(8.232f, 18.0f)
                lineTo(7.052f, 14.85f)
                lineTo(5.823f, 18.0f)
                horizontalLineTo(8.232f)
                close()
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
            }
        }
        .build()
        return _textSortDescending!!
    }

@Suppress("ObjectPropertyName")
private var _textSortDescending: ImageVector? = null

@Preview
@Composable
private fun TextSortDescendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextSortDescending, contentDescription = "TextSortDescending Icon")
    }
}

