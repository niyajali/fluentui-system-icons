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
 * WindowApps icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: window, apps
 * - Source: ic_fluent_window_apps_24_regular.svg
 * 
 * @return The [ImageVector] for the WindowApps icon.
 */
public val FluentIcons.Regular.WindowApps: ImageVector
    get() {
        if (_windowApps != null) {
            return _windowApps!!
        }
        _windowApps = Builder(name = "WindowApps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(9.009f)
                curveTo(9.003f, 20.917f, 9.0f, 20.834f, 9.0f, 20.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.75f)
                curveTo(20.834f, 9.0f, 20.917f, 9.003f, 21.0f, 9.009f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.25f, 15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.25f)
                curveTo(15.5f, 11.007f, 16.507f, 10.0f, 17.75f, 10.0f)
                horizontalLineTo(20.75f)
                curveTo(21.993f, 10.0f, 23.0f, 11.007f, 23.0f, 12.25f)
                verticalLineTo(19.75f)
                curveTo(23.0f, 21.545f, 21.545f, 23.0f, 19.75f, 23.0f)
                horizontalLineTo(12.25f)
                curveTo(11.007f, 23.0f, 10.0f, 21.993f, 10.0f, 20.75f)
                verticalLineTo(17.75f)
                curveTo(10.0f, 16.507f, 11.007f, 15.5f, 12.25f, 15.5f)
                close()
                moveTo(17.0f, 12.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(12.25f)
                curveTo(21.5f, 11.836f, 21.164f, 11.5f, 20.75f, 11.5f)
                horizontalLineTo(17.75f)
                curveTo(17.336f, 11.5f, 17.0f, 11.836f, 17.0f, 12.25f)
                close()
                moveTo(15.5f, 21.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.25f)
                curveTo(11.836f, 17.0f, 11.5f, 17.336f, 11.5f, 17.75f)
                verticalLineTo(20.75f)
                curveTo(11.5f, 21.164f, 11.836f, 21.5f, 12.25f, 21.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineTo(21.5f)
                horizontalLineTo(19.75f)
                curveTo(20.716f, 21.5f, 21.5f, 20.716f, 21.5f, 19.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _windowApps!!
    }

@Suppress("ObjectPropertyName")
private var _windowApps: ImageVector? = null

@Preview
@Composable
private fun WindowAppsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowApps, contentDescription = null)
    }
}

