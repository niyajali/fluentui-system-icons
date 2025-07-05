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
 * TrayItemAdd Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent loading/unloading scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tray_item_add_24_regular.svg)
 * 
 * @return The [ImageVector] for the TrayItemAdd icon.
 */
public val FluentIcons.Regular.TrayItemAdd: ImageVector
    get() {
        if (_trayItemAdd != null) {
            return _trayItemAdd!!
        }
        _trayItemAdd = Builder(name = "TrayItemAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(14.0f)
                close()
                moveTo(12.5f, 3.25f)
                curveTo(12.5f, 2.56f, 13.06f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(17.75f)
                curveTo(18.44f, 2.0f, 19.0f, 2.56f, 19.0f, 3.25f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 6.44f, 18.44f, 7.0f, 17.75f, 7.0f)
                horizontalLineTo(13.75f)
                curveTo(13.06f, 7.0f, 12.5f, 6.44f, 12.5f, 5.75f)
                verticalLineTo(3.25f)
                close()
                moveTo(15.75f, 8.5f)
                curveTo(16.164f, 8.5f, 16.5f, 8.836f, 16.5f, 9.25f)
                verticalLineTo(15.939f)
                lineTo(17.72f, 14.72f)
                curveTo(18.013f, 14.427f, 18.487f, 14.427f, 18.78f, 14.72f)
                curveTo(19.073f, 15.013f, 19.073f, 15.487f, 18.78f, 15.78f)
                lineTo(16.28f, 18.28f)
                curveTo(15.987f, 18.573f, 15.513f, 18.573f, 15.22f, 18.28f)
                lineTo(12.72f, 15.78f)
                curveTo(12.427f, 15.487f, 12.427f, 15.013f, 12.72f, 14.72f)
                curveTo(13.013f, 14.427f, 13.487f, 14.427f, 13.78f, 14.72f)
                lineTo(15.0f, 15.939f)
                verticalLineTo(9.25f)
                curveTo(15.0f, 8.836f, 15.336f, 8.5f, 15.75f, 8.5f)
                close()
                moveTo(6.5f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(5.0f, 14.75f)
                curveTo(5.0f, 14.06f, 5.56f, 13.5f, 6.25f, 13.5f)
                horizontalLineTo(10.25f)
                curveTo(10.94f, 13.5f, 11.5f, 14.06f, 11.5f, 14.75f)
                verticalLineTo(17.25f)
                curveTo(11.5f, 17.94f, 10.94f, 18.5f, 10.25f, 18.5f)
                horizontalLineTo(6.25f)
                curveTo(5.56f, 18.5f, 5.0f, 17.94f, 5.0f, 17.25f)
                verticalLineTo(14.75f)
                close()
                moveTo(2.75f, 16.0f)
                curveTo(3.164f, 16.0f, 3.5f, 16.336f, 3.5f, 16.75f)
                verticalLineTo(18.75f)
                curveTo(3.5f, 19.44f, 4.06f, 20.0f, 4.75f, 20.0f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 20.0f, 20.5f, 19.44f, 20.5f, 18.75f)
                verticalLineTo(16.75f)
                curveTo(20.5f, 16.336f, 20.836f, 16.0f, 21.25f, 16.0f)
                curveTo(21.664f, 16.0f, 22.0f, 16.336f, 22.0f, 16.75f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 20.269f, 20.769f, 21.5f, 19.25f, 21.5f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 21.5f, 2.0f, 20.269f, 2.0f, 18.75f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 16.336f, 2.336f, 16.0f, 2.75f, 16.0f)
                close()
            }
        }
        .build()
        return _trayItemAdd!!
    }

@Suppress("ObjectPropertyName")
private var _trayItemAdd: ImageVector? = null

@Preview
@Composable
private fun TrayItemAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TrayItemAdd, contentDescription = "TrayItemAdd Icon")
    }
}

