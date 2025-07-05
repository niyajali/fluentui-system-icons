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
 * DatabaseLightning Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in database scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_database_lightning_20_regular.svg)
 * 
 * @return The [ImageVector] for the DatabaseLightning icon.
 */
public val FluentIcons.Regular.DatabaseLightning: ImageVector
    get() {
        if (_databaseLightning != null) {
            return _databaseLightning!!
        }
        _databaseLightning = Builder(name = "DatabaseLightning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 3.993f, 4.875f, 3.245f, 5.9f, 2.777f)
                curveTo(7.198f, 2.237f, 8.594f, 1.973f, 10.0f, 2.0f)
                curveTo(11.406f, 1.973f, 12.802f, 2.237f, 14.1f, 2.777f)
                curveTo(15.125f, 3.245f, 16.0f, 3.993f, 16.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.7f)
                curveTo(14.719f, 6.906f, 14.418f, 7.082f, 14.1f, 7.225f)
                curveTo(12.802f, 7.764f, 11.406f, 8.028f, 10.0f, 8.0f)
                curveTo(8.594f, 8.027f, 7.198f, 7.762f, 5.9f, 7.223f)
                curveTo(5.582f, 7.081f, 5.281f, 6.906f, 5.0f, 6.7f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 15.374f, 5.356f, 15.875f, 6.318f, 16.313f)
                curveTo(7.485f, 16.792f, 8.739f, 17.026f, 10.0f, 17.0f)
                curveTo(10.498f, 17.01f, 10.995f, 16.98f, 11.486f, 16.91f)
                curveTo(11.645f, 16.968f, 11.818f, 17.0f, 12.002f, 17.0f)
                horizontalLineTo(12.471f)
                lineTo(12.274f, 17.787f)
                curveTo(11.528f, 17.943f, 10.766f, 18.015f, 10.0f, 18.0f)
                curveTo(8.594f, 18.027f, 7.198f, 17.762f, 5.9f, 17.223f)
                curveTo(4.875f, 16.755f, 4.0f, 16.007f, 4.0f, 15.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 5.0f)
                curveTo(5.0f, 5.374f, 5.356f, 5.875f, 6.318f, 6.313f)
                curveTo(7.485f, 6.792f, 8.739f, 7.026f, 10.0f, 7.0f)
                curveTo(11.262f, 7.026f, 12.515f, 6.792f, 13.682f, 6.313f)
                curveTo(14.644f, 5.875f, 15.0f, 5.374f, 15.0f, 5.0f)
                curveTo(15.0f, 4.626f, 14.644f, 4.125f, 13.682f, 3.687f)
                curveTo(12.515f, 3.208f, 11.262f, 2.974f, 10.0f, 3.0f)
                curveTo(8.739f, 2.974f, 7.485f, 3.208f, 6.318f, 3.687f)
                curveTo(5.356f, 4.125f, 5.0f, 4.626f, 5.0f, 5.0f)
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
        Image(imageVector = FluentIcons.Regular.DatabaseLightning, contentDescription = "DatabaseLightning Icon")
    }
}

