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
 * DatabaseMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: database, multiple
 * - Source: ic_fluent_database_multiple_20_regular.svg
 * 
 * @return The [ImageVector] for the DatabaseMultiple icon.
 */
public val FluentIcons.Regular.DatabaseMultiple: ImageVector
    get() {
        if (_databaseMultiple != null) {
            return _databaseMultiple!!
        }
        _databaseMultiple = Builder(name = "DatabaseMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.904f, 1.777f)
                curveTo(6.875f, 2.245f, 6.0f, 2.993f, 6.0f, 4.0f)
                verticalLineTo(7.014f)
                curveTo(6.165f, 7.005f, 6.332f, 7.0f, 6.5f, 7.0f)
                curveTo(6.668f, 7.0f, 6.835f, 7.005f, 7.0f, 7.014f)
                verticalLineTo(5.698f)
                curveTo(7.271f, 5.9f, 7.58f, 6.076f, 7.904f, 6.223f)
                curveTo(8.978f, 6.711f, 10.427f, 7.0f, 12.0f, 7.0f)
                curveTo(13.573f, 7.0f, 15.022f, 6.711f, 16.096f, 6.223f)
                curveTo(16.42f, 6.076f, 16.729f, 5.9f, 17.0f, 5.698f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 14.374f, 16.644f, 14.875f, 15.682f, 15.313f)
                curveTo(14.766f, 15.729f, 13.464f, 16.0f, 12.0f, 16.0f)
                lineTo(12.0f, 16.499f)
                curveTo(12.0f, 16.673f, 11.982f, 16.84f, 11.949f, 17.0f)
                lineTo(12.0f, 17.0f)
                curveTo(13.573f, 17.0f, 15.022f, 16.711f, 16.096f, 16.223f)
                curveTo(17.125f, 15.755f, 18.0f, 15.007f, 18.0f, 14.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.993f, 17.125f, 2.245f, 16.096f, 1.777f)
                curveTo(15.022f, 1.289f, 13.573f, 1.0f, 12.0f, 1.0f)
                curveTo(10.427f, 1.0f, 8.978f, 1.289f, 7.904f, 1.777f)
                close()
                moveTo(8.318f, 5.313f)
                curveTo(7.356f, 4.875f, 7.0f, 4.374f, 7.0f, 4.0f)
                curveTo(7.0f, 3.626f, 7.356f, 3.125f, 8.318f, 2.687f)
                curveTo(9.234f, 2.271f, 10.536f, 2.0f, 12.0f, 2.0f)
                curveTo(13.464f, 2.0f, 14.766f, 2.271f, 15.682f, 2.687f)
                curveTo(16.644f, 3.125f, 17.0f, 3.626f, 17.0f, 4.0f)
                curveTo(17.0f, 4.374f, 16.644f, 4.875f, 15.682f, 5.313f)
                curveTo(14.766f, 5.729f, 13.464f, 6.0f, 12.0f, 6.0f)
                curveTo(10.536f, 6.0f, 9.234f, 5.729f, 8.318f, 5.313f)
                close()
                moveTo(7.0f, 8.015f)
                curveTo(7.303f, 8.034f, 7.597f, 8.069f, 7.879f, 8.12f)
                curveTo(8.28f, 8.191f, 8.657f, 8.293f, 9.0f, 8.421f)
                curveTo(10.206f, 8.869f, 11.0f, 9.633f, 11.0f, 10.5f)
                curveTo(11.0f, 11.881f, 8.985f, 13.0f, 6.5f, 13.0f)
                curveTo(4.015f, 13.0f, 2.0f, 11.881f, 2.0f, 10.5f)
                curveTo(2.0f, 9.213f, 3.75f, 8.153f, 6.0f, 8.015f)
                curveTo(6.164f, 8.005f, 6.331f, 8.0f, 6.5f, 8.0f)
                curveTo(6.669f, 8.0f, 6.836f, 8.005f, 7.0f, 8.015f)
                close()
                moveTo(10.926f, 16.954f)
                curveTo(10.541f, 18.118f, 8.706f, 18.999f, 6.5f, 18.999f)
                curveTo(4.015f, 18.999f, 2.0f, 17.88f, 2.0f, 16.499f)
                verticalLineTo(12.554f)
                curveTo(2.255f, 12.783f, 2.54f, 12.979f, 2.832f, 13.142f)
                curveTo(3.821f, 13.691f, 5.12f, 14.0f, 6.5f, 14.0f)
                curveTo(7.88f, 14.0f, 9.179f, 13.691f, 10.168f, 13.142f)
                curveTo(10.46f, 12.979f, 10.746f, 12.782f, 11.001f, 12.553f)
                curveTo(11.001f, 13.529f, 11.0f, 14.975f, 11.0f, 15.957f)
                verticalLineTo(15.959f)
                curveTo(11.0f, 16.162f, 11.0f, 16.345f, 11.0f, 16.499f)
                curveTo(11.0f, 16.655f, 10.974f, 16.807f, 10.926f, 16.954f)
                close()
            }
        }
        .build()
        return _databaseMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _databaseMultiple: ImageVector? = null

@Preview
@Composable
private fun DatabaseMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DatabaseMultiple, contentDescription = null)
    }
}

