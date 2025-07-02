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
 * PersonStanding icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: person, standing
 * - Source: ic_fluent_person_standing_16_regular.svg
 * 
 * @return The [ImageVector] for the PersonStanding icon.
 */
public val FluentIcons.Regular.PersonStanding: ImageVector
    get() {
        if (_personStanding != null) {
            return _personStanding!!
        }
        _personStanding = Builder(name = "PersonStanding", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.342f, 4.535f)
                curveTo(9.597f, 4.17f, 9.75f, 3.728f, 9.75f, 3.25f)
                curveTo(9.75f, 2.009f, 8.74f, 1.0f, 7.5f, 1.0f)
                curveTo(6.26f, 1.0f, 5.25f, 2.009f, 5.25f, 3.25f)
                curveTo(5.25f, 3.728f, 5.402f, 4.17f, 5.658f, 4.535f)
                curveTo(4.719f, 4.699f, 4.0f, 5.515f, 4.0f, 6.5f)
                verticalLineTo(9.5f)
                curveTo(4.0f, 10.051f, 4.448f, 10.5f, 5.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(5.0f, 14.327f, 5.673f, 15.0f, 6.5f, 15.0f)
                horizontalLineTo(8.5f)
                curveTo(9.327f, 15.0f, 10.0f, 14.327f, 10.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(10.552f, 10.5f, 11.0f, 10.051f, 11.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 5.514f, 10.282f, 4.698f, 9.342f, 4.535f)
                close()
                moveTo(7.5f, 2.0f)
                curveTo(8.189f, 2.0f, 8.75f, 2.561f, 8.75f, 3.25f)
                curveTo(8.75f, 3.939f, 8.189f, 4.5f, 7.5f, 4.5f)
                curveTo(6.811f, 4.5f, 6.25f, 3.939f, 6.25f, 3.25f)
                curveTo(6.25f, 2.561f, 6.811f, 2.0f, 7.5f, 2.0f)
                close()
                moveTo(10.0f, 9.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.5f)
                curveTo(9.0f, 13.776f, 8.775f, 14.0f, 8.5f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                curveTo(8.0f, 10.724f, 7.776f, 10.5f, 7.5f, 10.5f)
                curveTo(7.224f, 10.5f, 7.0f, 10.724f, 7.0f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.5f)
                curveTo(6.225f, 14.0f, 6.0f, 13.776f, 6.0f, 13.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.5f)
                curveTo(5.0f, 5.949f, 5.448f, 5.5f, 6.0f, 5.5f)
                horizontalLineTo(9.0f)
                curveTo(9.552f, 5.5f, 10.0f, 5.949f, 10.0f, 6.5f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _personStanding!!
    }

@Suppress("ObjectPropertyName")
private var _personStanding: ImageVector? = null

@Preview
@Composable
private fun PersonStandingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonStanding, contentDescription = null)
    }
}

