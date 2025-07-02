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
 * DatabaseMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: database, multiple
 * - Source: ic_fluent_database_multiple_20_filled.svg
 * 
 * @return The [ImageVector] for the DatabaseMultiple icon.
 */
public val FluentIcons.Filled.DatabaseMultiple: ImageVector
    get() {
        if (_databaseMultiple != null) {
            return _databaseMultiple!!
        }
        _databaseMultiple = Builder(name = "DatabaseMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                curveTo(18.0f, 5.657f, 15.314f, 7.0f, 12.0f, 7.0f)
                curveTo(8.686f, 7.0f, 6.0f, 5.657f, 6.0f, 4.0f)
                curveTo(6.0f, 2.343f, 8.686f, 1.0f, 12.0f, 1.0f)
                curveTo(15.314f, 1.0f, 18.0f, 2.343f, 18.0f, 4.0f)
                close()
                moveTo(18.0f, 6.12f)
                curveTo(17.617f, 6.482f, 17.159f, 6.781f, 16.69f, 7.016f)
                curveTo(15.438f, 7.642f, 13.778f, 8.0f, 12.0f, 8.0f)
                curveTo(11.377f, 8.0f, 10.77f, 7.956f, 10.189f, 7.872f)
                curveTo(11.124f, 8.4f, 11.913f, 9.213f, 11.993f, 10.314f)
                lineTo(12.002f, 10.306f)
                lineTo(12.001f, 12.553f)
                curveTo(12.001f, 13.732f, 12.0f, 15.596f, 12.0f, 16.499f)
                curveTo(12.0f, 16.673f, 11.982f, 16.84f, 11.949f, 17.0f)
                lineTo(12.0f, 17.0f)
                curveTo(15.314f, 17.0f, 18.0f, 15.657f, 18.0f, 14.0f)
                verticalLineTo(6.12f)
                close()
                moveTo(7.31f, 7.016f)
                lineTo(7.36f, 7.041f)
                curveTo(7.08f, 7.014f, 6.792f, 7.0f, 6.5f, 7.0f)
                curveTo(6.332f, 7.0f, 6.165f, 7.005f, 6.0f, 7.014f)
                verticalLineTo(6.12f)
                curveTo(6.383f, 6.482f, 6.841f, 6.781f, 7.31f, 7.016f)
                close()
                moveTo(9.0f, 8.421f)
                curveTo(8.657f, 8.293f, 8.28f, 8.191f, 7.879f, 8.12f)
                curveTo(7.445f, 8.042f, 6.981f, 8.0f, 6.5f, 8.0f)
                curveTo(4.015f, 8.0f, 2.0f, 9.119f, 2.0f, 10.5f)
                curveTo(2.0f, 11.881f, 4.015f, 13.0f, 6.5f, 13.0f)
                curveTo(8.985f, 13.0f, 11.0f, 11.881f, 11.0f, 10.5f)
                curveTo(11.0f, 9.633f, 10.206f, 8.869f, 9.0f, 8.421f)
                close()
                moveTo(10.168f, 13.142f)
                curveTo(9.179f, 13.691f, 7.88f, 14.0f, 6.5f, 14.0f)
                curveTo(5.12f, 14.0f, 3.821f, 13.691f, 2.832f, 13.142f)
                curveTo(2.54f, 12.979f, 2.255f, 12.783f, 2.0f, 12.554f)
                verticalLineTo(16.499f)
                curveTo(2.0f, 17.88f, 4.015f, 18.999f, 6.5f, 18.999f)
                curveTo(8.985f, 18.999f, 11.0f, 17.88f, 11.0f, 16.499f)
                curveTo(11.0f, 15.595f, 11.001f, 13.731f, 11.001f, 12.553f)
                curveTo(10.746f, 12.782f, 10.46f, 12.979f, 10.168f, 13.142f)
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
        Image(imageVector = FluentIcons.Filled.DatabaseMultiple, contentDescription = null)
    }
}

