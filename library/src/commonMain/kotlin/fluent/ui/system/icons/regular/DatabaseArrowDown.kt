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
 * DatabaseArrowDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in database scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_database_arrow_down_20_regular.svg)
 * 
 * @return The [ImageVector] for the DatabaseArrowDown icon.
 */
public val FluentIcons.Regular.DatabaseArrowDown: ImageVector
    get() {
        if (_databaseArrowDown != null) {
            return _databaseArrowDown!!
        }
        _databaseArrowDown = Builder(name = "DatabaseArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 3.993f, 4.875f, 3.245f, 5.9f, 2.777f)
                curveTo(7.198f, 2.237f, 8.594f, 1.973f, 10.0f, 2.0f)
                curveTo(11.406f, 1.973f, 12.802f, 2.237f, 14.1f, 2.777f)
                curveTo(15.125f, 3.245f, 16.0f, 3.993f, 16.0f, 5.0f)
                verticalLineTo(9.207f)
                curveTo(15.678f, 9.116f, 15.343f, 9.053f, 15.0f, 9.022f)
                verticalLineTo(6.7f)
                curveTo(14.719f, 6.906f, 14.418f, 7.082f, 14.1f, 7.225f)
                curveTo(12.802f, 7.764f, 11.406f, 8.028f, 10.0f, 8.0f)
                curveTo(8.594f, 8.027f, 7.198f, 7.762f, 5.9f, 7.223f)
                curveTo(5.582f, 7.081f, 5.281f, 6.906f, 5.0f, 6.7f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 15.374f, 5.356f, 15.875f, 6.318f, 16.313f)
                curveTo(7.362f, 16.741f, 8.474f, 16.973f, 9.599f, 16.999f)
                curveTo(9.783f, 17.358f, 10.004f, 17.694f, 10.259f, 18.002f)
                curveTo(10.172f, 18.002f, 10.086f, 18.002f, 10.0f, 18.0f)
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
        Image(imageVector = FluentIcons.Regular.DatabaseArrowDown, contentDescription = "DatabaseArrowDown Icon")
    }
}

