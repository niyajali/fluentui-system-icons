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
 * DatabaseWarning icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: database, warning
 * - Source: ic_fluent_database_warning_20_regular.svg
 * 
 * @return The [ImageVector] for the DatabaseWarning icon.
 */
public val FluentIcons.Regular.DatabaseWarning: ImageVector
    get() {
        if (_databaseWarning != null) {
            return _databaseWarning!!
        }
        _databaseWarning = Builder(name = "DatabaseWarning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 3.993f, 4.875f, 3.245f, 5.9f, 2.777f)
                curveTo(7.198f, 2.237f, 8.594f, 1.973f, 10.0f, 2.0f)
                curveTo(11.406f, 1.973f, 12.802f, 2.237f, 14.1f, 2.777f)
                curveTo(15.125f, 3.245f, 16.0f, 3.993f, 16.0f, 5.0f)
                verticalLineTo(8.061f)
                curveTo(15.673f, 7.979f, 15.327f, 7.98f, 15.0f, 8.063f)
                verticalLineTo(6.7f)
                curveTo(14.719f, 6.906f, 14.418f, 7.082f, 14.1f, 7.225f)
                curveTo(12.802f, 7.764f, 11.406f, 8.028f, 10.0f, 8.0f)
                curveTo(8.594f, 8.027f, 7.198f, 7.762f, 5.9f, 7.223f)
                curveTo(5.582f, 7.081f, 5.281f, 6.906f, 5.0f, 6.7f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 15.374f, 5.356f, 15.875f, 6.318f, 16.313f)
                curveTo(7.485f, 16.792f, 8.739f, 17.026f, 10.0f, 17.0f)
                lineTo(10.004f, 17.0f)
                curveTo(10.004f, 17.356f, 10.102f, 17.701f, 10.276f, 18.001f)
                curveTo(10.184f, 18.002f, 10.092f, 18.002f, 10.0f, 18.0f)
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
        Image(imageVector = FluentIcons.Regular.DatabaseWarning, contentDescription = null)
    }
}

