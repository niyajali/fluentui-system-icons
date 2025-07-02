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
 * DatabaseWindow icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: database, window
 * - Source: ic_fluent_database_window_20_regular.svg
 * 
 * @return The [ImageVector] for the DatabaseWindow icon.
 */
public val FluentIcons.Regular.DatabaseWindow: ImageVector
    get() {
        if (_databaseWindow != null) {
            return _databaseWindow!!
        }
        _databaseWindow = Builder(name = "DatabaseWindow", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 3.993f, 4.875f, 3.245f, 5.904f, 2.777f)
                curveTo(6.978f, 2.289f, 8.427f, 2.0f, 10.0f, 2.0f)
                curveTo(11.573f, 2.0f, 13.022f, 2.289f, 14.096f, 2.777f)
                curveTo(15.125f, 3.245f, 16.0f, 3.993f, 16.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.698f)
                curveTo(14.729f, 6.9f, 14.42f, 7.076f, 14.096f, 7.223f)
                curveTo(13.022f, 7.711f, 11.573f, 8.0f, 10.0f, 8.0f)
                curveTo(8.427f, 8.0f, 6.978f, 7.711f, 5.904f, 7.223f)
                curveTo(5.58f, 7.076f, 5.271f, 6.9f, 5.0f, 6.698f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 15.374f, 5.356f, 15.875f, 6.318f, 16.313f)
                curveTo(7.02f, 16.632f, 7.947f, 16.865f, 9.0f, 16.957f)
                verticalLineTo(17.5f)
                curveTo(9.0f, 17.659f, 9.015f, 17.813f, 9.043f, 17.964f)
                curveTo(7.844f, 17.872f, 6.756f, 17.61f, 5.904f, 17.223f)
                curveTo(4.875f, 16.755f, 4.0f, 16.007f, 4.0f, 15.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 5.0f)
                curveTo(5.0f, 5.374f, 5.356f, 5.875f, 6.318f, 6.313f)
                curveTo(7.234f, 6.729f, 8.536f, 7.0f, 10.0f, 7.0f)
                curveTo(11.464f, 7.0f, 12.766f, 6.729f, 13.682f, 6.313f)
                curveTo(14.644f, 5.875f, 15.0f, 5.374f, 15.0f, 5.0f)
                curveTo(15.0f, 4.626f, 14.644f, 4.125f, 13.682f, 3.687f)
                curveTo(12.766f, 3.271f, 11.464f, 3.0f, 10.0f, 3.0f)
                curveTo(8.536f, 3.0f, 7.234f, 3.271f, 6.318f, 3.687f)
                curveTo(5.356f, 4.125f, 5.0f, 4.626f, 5.0f, 5.0f)
                close()
                moveTo(10.0f, 11.5f)
                curveTo(10.0f, 10.672f, 10.672f, 10.0f, 11.5f, 10.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 10.0f, 19.0f, 10.672f, 19.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.5f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.328f, 18.328f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 19.0f, 10.0f, 18.328f, 10.0f, 17.5f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _databaseWindow!!
    }

@Suppress("ObjectPropertyName")
private var _databaseWindow: ImageVector? = null

@Preview
@Composable
private fun DatabaseWindowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DatabaseWindow, contentDescription = null)
    }
}

