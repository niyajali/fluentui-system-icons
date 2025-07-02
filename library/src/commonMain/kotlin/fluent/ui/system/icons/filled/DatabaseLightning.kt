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
 * DatabaseLightning icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: database, lightning
 * - Source: ic_fluent_database_lightning_20_filled.svg
 * 
 * @return The [ImageVector] for the DatabaseLightning icon.
 */
public val FluentIcons.Filled.DatabaseLightning: ImageVector
    get() {
        if (_databaseLightning != null) {
            return _databaseLightning!!
        }
        _databaseLightning = Builder(name = "DatabaseLightning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                curveTo(13.314f, 8.0f, 16.0f, 6.657f, 16.0f, 5.0f)
                curveTo(16.0f, 3.343f, 13.314f, 2.0f, 10.0f, 2.0f)
                curveTo(6.686f, 2.0f, 4.0f, 3.343f, 4.0f, 5.0f)
                curveTo(4.0f, 6.657f, 6.686f, 8.0f, 10.0f, 8.0f)
                close()
                moveTo(14.69f, 8.016f)
                curveTo(15.159f, 7.781f, 15.617f, 7.482f, 16.0f, 7.12f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.085f)
                curveTo(13.479f, 9.0f, 12.933f, 9.364f, 12.7f, 9.923f)
                lineTo(10.617f, 14.923f)
                curveTo(10.205f, 15.911f, 10.931f, 17.0f, 12.002f, 17.0f)
                horizontalLineTo(12.471f)
                lineTo(12.277f, 17.777f)
                curveTo(11.575f, 17.921f, 10.806f, 18.0f, 10.0f, 18.0f)
                curveTo(6.686f, 18.0f, 4.0f, 16.657f, 4.0f, 15.0f)
                verticalLineTo(7.12f)
                curveTo(4.383f, 7.482f, 4.841f, 7.781f, 5.31f, 8.016f)
                curveTo(6.562f, 8.642f, 8.222f, 9.0f, 10.0f, 9.0f)
                curveTo(11.778f, 9.0f, 13.438f, 8.642f, 14.69f, 8.016f)
                close()
                moveTo(13.112f, 16.0f)
                curveTo(13.437f, 16.0f, 13.676f, 16.306f, 13.597f, 16.621f)
                lineTo(13.163f, 18.359f)
                curveTo(13.042f, 18.842f, 13.625f, 19.186f, 13.989f, 18.846f)
                lineTo(18.861f, 14.298f)
                curveTo(19.359f, 13.834f, 19.03f, 13.0f, 18.35f, 13.0f)
                horizontalLineTo(17.946f)
                curveTo(17.605f, 13.0f, 17.364f, 12.666f, 17.472f, 12.342f)
                lineTo(18.033f, 10.658f)
                curveTo(18.141f, 10.334f, 17.9f, 10.0f, 17.559f, 10.0f)
                horizontalLineTo(14.086f)
                curveTo(13.884f, 10.0f, 13.702f, 10.121f, 13.624f, 10.308f)
                lineTo(11.541f, 15.308f)
                curveTo(11.404f, 15.637f, 11.646f, 16.0f, 12.002f, 16.0f)
                horizontalLineTo(13.112f)
                close()
            }
        }
        .build()
        return _databaseLightning!!
    }

@Suppress("ObjectPropertyName")
private var _databaseLightning: ImageVector? = null

@Preview
@Composable
private fun DatabaseLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DatabaseLightning, contentDescription = null)
    }
}

