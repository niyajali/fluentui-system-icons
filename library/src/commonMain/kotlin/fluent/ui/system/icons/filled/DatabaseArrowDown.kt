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
 * DatabaseArrowDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in database scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_database_arrow_down_20_filled.svg)
 * 
 * @return The [ImageVector] for the DatabaseArrowDown icon.
 */
public val FluentIcons.Filled.DatabaseArrowDown: ImageVector
    get() {
        if (_databaseArrowDown != null) {
            return _databaseArrowDown!!
        }
        _databaseArrowDown = Builder(name = "DatabaseArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                curveTo(13.314f, 8.0f, 16.0f, 6.657f, 16.0f, 5.0f)
                curveTo(16.0f, 3.343f, 13.314f, 2.0f, 10.0f, 2.0f)
                curveTo(6.686f, 2.0f, 4.0f, 3.343f, 4.0f, 5.0f)
                curveTo(4.0f, 6.657f, 6.686f, 8.0f, 10.0f, 8.0f)
                close()
                moveTo(14.69f, 8.016f)
                curveTo(15.159f, 7.781f, 15.617f, 7.482f, 16.0f, 7.12f)
                verticalLineTo(9.207f)
                curveTo(15.523f, 9.072f, 15.02f, 9.0f, 14.5f, 9.0f)
                curveTo(11.462f, 9.0f, 9.0f, 11.462f, 9.0f, 14.5f)
                curveTo(9.0f, 15.828f, 9.471f, 17.047f, 10.255f, 17.997f)
                curveTo(10.17f, 17.999f, 10.085f, 18.0f, 10.0f, 18.0f)
                curveTo(6.686f, 18.0f, 4.0f, 16.657f, 4.0f, 15.0f)
                verticalLineTo(7.12f)
                curveTo(4.383f, 7.482f, 4.841f, 7.781f, 5.31f, 8.016f)
                curveTo(6.562f, 8.642f, 8.222f, 9.0f, 10.0f, 9.0f)
                curveTo(11.778f, 9.0f, 13.438f, 8.642f, 14.69f, 8.016f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(14.146f, 16.853f)
                lineTo(14.149f, 16.856f)
                curveTo(14.196f, 16.903f, 14.25f, 16.938f, 14.309f, 16.962f)
                curveTo(14.367f, 16.986f, 14.43f, 17.0f, 14.497f, 17.0f)
                lineTo(14.5f, 17.0f)
                lineTo(14.503f, 17.0f)
                curveTo(14.57f, 17.0f, 14.633f, 16.986f, 14.691f, 16.962f)
                curveTo(14.75f, 16.938f, 14.806f, 16.902f, 14.854f, 16.854f)
                lineTo(16.854f, 14.854f)
                curveTo(17.049f, 14.658f, 17.049f, 14.342f, 16.854f, 14.146f)
                curveTo(16.658f, 13.951f, 16.342f, 13.951f, 16.146f, 14.146f)
                lineTo(15.0f, 15.293f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 12.224f, 14.776f, 12.0f, 14.5f, 12.0f)
                curveTo(14.224f, 12.0f, 14.0f, 12.224f, 14.0f, 12.5f)
                verticalLineTo(15.293f)
                lineTo(12.854f, 14.146f)
                curveTo(12.658f, 13.951f, 12.342f, 13.951f, 12.146f, 14.146f)
                curveTo(11.951f, 14.342f, 11.951f, 14.658f, 12.146f, 14.854f)
                lineTo(14.146f, 16.853f)
                close()
            }
        }
        .build()
        return _databaseArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _databaseArrowDown: ImageVector? = null

@Preview
@Composable
private fun DatabaseArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DatabaseArrowDown, contentDescription = "DatabaseArrowDown Icon")
    }
}

