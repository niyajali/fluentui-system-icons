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
 * PersonDesktop Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in a wide range of scenarios - representing a general person, a contact, contact lists, sharing, and managing access.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_person_desktop_20_regular.svg)
 * 
 * @return The [ImageVector] for the PersonDesktop icon.
 */
public val FluentIcons.Regular.PersonDesktop: ImageVector
    get() {
        if (_personDesktop != null) {
            return _personDesktop!!
        }
        _personDesktop = Builder(name = "PersonDesktop", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(7.791f, 2.0f, 6.0f, 3.791f, 6.0f, 6.0f)
                curveTo(6.0f, 8.209f, 7.791f, 10.0f, 10.0f, 10.0f)
                curveTo(12.209f, 10.0f, 14.0f, 8.209f, 14.0f, 6.0f)
                curveTo(14.0f, 3.791f, 12.209f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(7.0f, 6.0f)
                curveTo(7.0f, 4.343f, 8.343f, 3.0f, 10.0f, 3.0f)
                curveTo(11.657f, 3.0f, 13.0f, 4.343f, 13.0f, 6.0f)
                curveTo(13.0f, 7.657f, 11.657f, 9.0f, 10.0f, 9.0f)
                curveTo(8.343f, 9.0f, 7.0f, 7.657f, 7.0f, 6.0f)
                close()
                moveTo(5.009f, 11.0f)
                curveTo(3.903f, 11.0f, 3.0f, 11.887f, 3.0f, 13.0f)
                curveTo(3.0f, 14.691f, 3.833f, 15.966f, 5.135f, 16.797f)
                curveTo(6.417f, 17.614f, 8.145f, 18.0f, 10.0f, 18.0f)
                curveTo(10.242f, 18.0f, 10.481f, 17.993f, 10.718f, 17.98f)
                curveTo(10.088f, 17.891f, 9.553f, 17.509f, 9.254f, 16.977f)
                curveTo(7.83f, 16.887f, 6.587f, 16.536f, 5.673f, 15.953f)
                curveTo(4.622f, 15.284f, 4.0f, 14.309f, 4.0f, 13.0f)
                curveTo(4.0f, 12.447f, 4.448f, 12.0f, 5.009f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 11.636f, 9.097f, 11.294f, 9.268f, 11.0f)
                lineTo(5.009f, 11.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 11.448f, 10.448f, 11.0f, 11.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 11.0f, 19.0f, 11.448f, 19.0f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 16.552f, 18.552f, 17.0f, 18.0f, 17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 18.0f, 17.0f, 18.224f, 17.0f, 18.5f)
                curveTo(17.0f, 18.776f, 16.776f, 19.0f, 16.5f, 19.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 19.0f, 12.0f, 18.776f, 12.0f, 18.5f)
                curveTo(12.0f, 18.224f, 12.224f, 18.0f, 12.5f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                curveTo(10.448f, 17.0f, 10.0f, 16.552f, 10.0f, 16.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _personDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _personDesktop: ImageVector? = null

@Preview
@Composable
private fun PersonDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonDesktop, contentDescription = "PersonDesktop Icon")
    }
}

