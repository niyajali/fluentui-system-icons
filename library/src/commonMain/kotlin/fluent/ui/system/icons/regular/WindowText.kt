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
 * WindowText Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_text_24_regular.svg)
 * 
 * @return The [ImageVector] for the WindowText icon.
 */
public val FluentIcons.Regular.WindowText: ImageVector
    get() {
        if (_windowText != null) {
            return _windowText!!
        }
        _windowText = Builder(name = "WindowText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.5f, 7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                close()
                moveTo(19.5f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.75f, 10.5f)
                curveTo(6.336f, 10.5f, 6.0f, 10.836f, 6.0f, 11.25f)
                curveTo(6.0f, 11.664f, 6.336f, 12.0f, 6.75f, 12.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 12.0f, 18.0f, 11.664f, 18.0f, 11.25f)
                curveTo(18.0f, 10.836f, 17.664f, 10.5f, 17.25f, 10.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.75f, 13.25f)
                curveTo(6.336f, 13.25f, 6.0f, 13.586f, 6.0f, 14.0f)
                curveTo(6.0f, 14.414f, 6.336f, 14.75f, 6.75f, 14.75f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 14.75f, 13.5f, 14.414f, 13.5f, 14.0f)
                curveTo(13.5f, 13.586f, 13.164f, 13.25f, 12.75f, 13.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(15.75f, 13.25f)
                curveTo(15.336f, 13.25f, 15.0f, 13.586f, 15.0f, 14.0f)
                curveTo(15.0f, 14.414f, 15.336f, 14.75f, 15.75f, 14.75f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 14.75f, 18.0f, 14.414f, 18.0f, 14.0f)
                curveTo(18.0f, 13.586f, 17.664f, 13.25f, 17.25f, 13.25f)
                horizontalLineTo(15.75f)
                close()
                moveTo(6.75f, 16.0f)
                curveTo(6.336f, 16.0f, 6.0f, 16.336f, 6.0f, 16.75f)
                curveTo(6.0f, 17.164f, 6.336f, 17.5f, 6.75f, 17.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 17.5f, 9.0f, 17.164f, 9.0f, 16.75f)
                curveTo(9.0f, 16.336f, 8.664f, 16.0f, 8.25f, 16.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(11.25f, 16.0f)
                curveTo(10.836f, 16.0f, 10.5f, 16.336f, 10.5f, 16.75f)
                curveTo(10.5f, 17.164f, 10.836f, 17.5f, 11.25f, 17.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 17.5f, 18.0f, 17.164f, 18.0f, 16.75f)
                curveTo(18.0f, 16.336f, 17.664f, 16.0f, 17.25f, 16.0f)
                horizontalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _windowText!!
    }

@Suppress("ObjectPropertyName")
private var _windowText: ImageVector? = null

@Preview
@Composable
private fun WindowTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowText, contentDescription = "WindowText Icon")
    }
}

