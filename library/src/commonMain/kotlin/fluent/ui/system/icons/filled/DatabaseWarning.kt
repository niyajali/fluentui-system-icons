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
 * DatabaseWarning Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in database scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_database_warning_20_filled.svg)
 * 
 * @return The [ImageVector] for the DatabaseWarning icon.
 */
public val FluentIcons.Filled.DatabaseWarning: ImageVector
    get() {
        if (_databaseWarning != null) {
            return _databaseWarning!!
        }
        _databaseWarning = Builder(name = "DatabaseWarning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(16.0f, 6.657f, 13.314f, 8.0f, 10.0f, 8.0f)
                curveTo(6.686f, 8.0f, 4.0f, 6.657f, 4.0f, 5.0f)
                curveTo(4.0f, 3.343f, 6.686f, 2.0f, 10.0f, 2.0f)
                curveTo(13.314f, 2.0f, 16.0f, 3.343f, 16.0f, 5.0f)
                close()
                moveTo(14.69f, 8.016f)
                curveTo(14.794f, 7.964f, 14.898f, 7.908f, 15.0f, 7.85f)
                verticalLineTo(8.063f)
                curveTo(14.473f, 8.196f, 13.993f, 8.544f, 13.712f, 9.107f)
                lineTo(10.217f, 16.104f)
                curveTo(9.896f, 16.748f, 9.956f, 17.447f, 10.273f, 17.997f)
                curveTo(10.183f, 17.999f, 10.092f, 18.0f, 10.0f, 18.0f)
                curveTo(6.686f, 18.0f, 4.0f, 16.657f, 4.0f, 15.0f)
                verticalLineTo(7.12f)
                curveTo(4.383f, 7.482f, 4.841f, 7.781f, 5.31f, 8.016f)
                curveTo(6.562f, 8.642f, 8.222f, 9.0f, 10.0f, 9.0f)
                curveTo(11.778f, 9.0f, 13.438f, 8.642f, 14.69f, 8.016f)
                close()
                moveTo(14.603f, 9.554f)
                lineTo(11.107f, 16.552f)
                curveTo(10.774f, 17.217f, 11.258f, 18.0f, 12.002f, 18.0f)
                horizontalLineTo(18.998f)
                curveTo(19.742f, 18.0f, 20.226f, 17.217f, 19.893f, 16.552f)
                lineTo(16.393f, 9.553f)
                curveTo(16.025f, 8.815f, 14.972f, 8.816f, 14.603f, 9.554f)
                close()
                moveTo(15.998f, 11.495f)
                verticalLineTo(14.497f)
                curveTo(15.998f, 14.774f, 15.774f, 14.998f, 15.498f, 14.998f)
                curveTo(15.222f, 14.998f, 14.998f, 14.774f, 14.998f, 14.497f)
                verticalLineTo(11.495f)
                curveTo(14.998f, 11.219f, 15.222f, 10.995f, 15.498f, 10.995f)
                curveTo(15.774f, 10.995f, 15.998f, 11.219f, 15.998f, 11.495f)
                close()
                moveTo(15.498f, 16.999f)
                curveTo(15.222f, 16.999f, 14.998f, 16.775f, 14.998f, 16.499f)
                curveTo(14.998f, 16.223f, 15.222f, 15.999f, 15.498f, 15.999f)
                curveTo(15.774f, 15.999f, 15.998f, 16.223f, 15.998f, 16.499f)
                curveTo(15.998f, 16.775f, 15.774f, 16.999f, 15.498f, 16.999f)
                close()
            }
        }
        .build()
        return _databaseWarning!!
    }

@Suppress("ObjectPropertyName")
private var _databaseWarning: ImageVector? = null

@Preview
@Composable
private fun DatabaseWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DatabaseWarning, contentDescription = "DatabaseWarning Icon")
    }
}

