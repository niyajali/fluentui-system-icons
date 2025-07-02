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
 * PersonRunning icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: person, running
 * - Source: ic_fluent_person_running_20_filled.svg
 * 
 * @return The [ImageVector] for the PersonRunning icon.
 */
public val FluentIcons.Filled.PersonRunning: ImageVector
    get() {
        if (_personRunning != null) {
            return _personRunning!!
        }
        _personRunning = Builder(name = "PersonRunning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 4.5f)
                curveTo(11.5f, 3.395f, 12.395f, 2.5f, 13.5f, 2.5f)
                curveTo(14.605f, 2.5f, 15.5f, 3.395f, 15.5f, 4.5f)
                curveTo(15.5f, 5.391f, 14.917f, 6.146f, 14.112f, 6.405f)
                lineTo(15.707f, 8.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 8.0f, 19.0f, 8.672f, 19.0f, 9.5f)
                curveTo(19.0f, 10.328f, 18.328f, 11.0f, 17.5f, 11.0f)
                horizontalLineTo(14.277f)
                curveTo(13.647f, 11.0f, 13.042f, 10.75f, 12.597f, 10.304f)
                lineTo(12.5f, 10.207f)
                lineTo(11.457f, 11.25f)
                lineTo(12.854f, 12.646f)
                curveTo(12.947f, 12.74f, 13.0f, 12.867f, 13.0f, 13.0f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 17.328f, 12.328f, 18.0f, 11.5f, 18.0f)
                curveTo(10.672f, 18.0f, 10.0f, 17.328f, 10.0f, 16.5f)
                verticalLineTo(14.707f)
                lineTo(8.453f, 13.16f)
                lineTo(7.451f, 13.912f)
                curveTo(6.942f, 14.293f, 6.323f, 14.5f, 5.686f, 14.5f)
                horizontalLineTo(2.5f)
                curveTo(1.672f, 14.5f, 1.0f, 13.828f, 1.0f, 13.0f)
                curveTo(1.0f, 12.172f, 1.672f, 11.5f, 2.5f, 11.5f)
                horizontalLineTo(6.75f)
                curveTo(7.993f, 11.5f, 9.0f, 10.493f, 9.0f, 9.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                curveTo(10.276f, 8.0f, 10.5f, 7.776f, 10.5f, 7.5f)
                curveTo(10.5f, 7.224f, 10.276f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 7.0f, 8.0f, 7.224f, 8.0f, 7.5f)
                verticalLineTo(9.25f)
                curveTo(8.0f, 9.94f, 7.44f, 10.5f, 6.75f, 10.5f)
                curveTo(6.06f, 10.5f, 5.5f, 9.94f, 5.5f, 9.25f)
                verticalLineTo(7.0f)
                curveTo(5.5f, 5.619f, 6.619f, 4.5f, 8.0f, 4.5f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _personRunning!!
    }

@Suppress("ObjectPropertyName")
private var _personRunning: ImageVector? = null

@Preview
@Composable
private fun PersonRunningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonRunning, contentDescription = null)
    }
}

