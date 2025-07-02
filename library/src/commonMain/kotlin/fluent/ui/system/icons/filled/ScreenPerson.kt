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
 * ScreenPerson icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: screen, person
 * - Source: ic_fluent_screen_person_20_filled.svg
 * 
 * @return The [ImageVector] for the ScreenPerson icon.
 */
public val FluentIcons.Filled.ScreenPerson: ImageVector
    get() {
        if (_screenPerson != null) {
            return _screenPerson!!
        }
        _screenPerson = Builder(name = "ScreenPerson", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                curveTo(3.343f, 4.0f, 2.0f, 5.343f, 2.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 14.657f, 3.343f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(11.05f)
                curveTo(11.267f, 14.931f, 12.166f, 14.11f, 13.273f, 14.01f)
                curveTo(12.793f, 13.478f, 12.5f, 12.773f, 12.5f, 12.0f)
                curveTo(12.5f, 10.343f, 13.843f, 9.0f, 15.5f, 9.0f)
                curveTo(16.544f, 9.0f, 17.462f, 9.533f, 18.0f, 10.341f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 5.343f, 16.657f, 4.0f, 15.0f, 4.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(17.5f, 13.105f, 16.605f, 14.0f, 15.5f, 14.0f)
                curveTo(14.395f, 14.0f, 13.5f, 13.105f, 13.5f, 12.0f)
                curveTo(13.5f, 10.895f, 14.395f, 10.0f, 15.5f, 10.0f)
                curveTo(16.605f, 10.0f, 17.5f, 10.895f, 17.5f, 12.0f)
                close()
                moveTo(19.0f, 16.5f)
                curveTo(19.0f, 17.745f, 18.0f, 19.0f, 15.5f, 19.0f)
                curveTo(13.0f, 19.0f, 12.0f, 17.75f, 12.0f, 16.5f)
                curveTo(12.0f, 15.672f, 12.672f, 15.0f, 13.5f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 15.0f, 19.0f, 15.672f, 19.0f, 16.5f)
                close()
            }
        }
        .build()
        return _screenPerson!!
    }

@Suppress("ObjectPropertyName")
private var _screenPerson: ImageVector? = null

@Preview
@Composable
private fun ScreenPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ScreenPerson, contentDescription = null)
    }
}

