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
 * Xray Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, xbox
 * - Description: Used to represent x-rays and general medical equipment.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_xray_24_regular.svg)
 * 
 * @return The [ImageVector] for the Xray icon.
 */
public val FluentIcons.Regular.Xray: ImageVector
    get() {
        if (_xray != null) {
            return _xray!!
        }
        _xray = Builder(name = "Xray", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 5.75f)
                curveTo(12.75f, 5.336f, 12.414f, 5.0f, 12.0f, 5.0f)
                curveTo(11.586f, 5.0f, 11.25f, 5.336f, 11.25f, 5.75f)
                verticalLineTo(6.5f)
                horizontalLineTo(9.0f)
                curveTo(8.586f, 6.5f, 8.25f, 6.836f, 8.25f, 7.25f)
                curveTo(8.25f, 7.664f, 8.586f, 8.0f, 9.0f, 8.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 9.0f, 7.0f, 9.336f, 7.0f, 9.75f)
                curveTo(7.0f, 10.164f, 7.336f, 10.5f, 7.75f, 10.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11.5f, 7.0f, 11.836f, 7.0f, 12.25f)
                curveTo(7.0f, 12.664f, 7.336f, 13.0f, 7.75f, 13.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.25f)
                curveTo(8.007f, 14.5f, 7.0f, 15.507f, 7.0f, 16.75f)
                curveTo(7.0f, 17.993f, 8.007f, 19.0f, 9.25f, 19.0f)
                curveTo(10.493f, 19.0f, 11.5f, 17.993f, 11.5f, 16.75f)
                curveTo(11.5f, 16.487f, 11.455f, 16.235f, 11.372f, 16.0f)
                horizontalLineTo(12.628f)
                curveTo(12.545f, 16.235f, 12.5f, 16.487f, 12.5f, 16.75f)
                curveTo(12.5f, 17.993f, 13.507f, 19.0f, 14.75f, 19.0f)
                curveTo(15.993f, 19.0f, 17.0f, 17.993f, 17.0f, 16.75f)
                curveTo(17.0f, 15.507f, 15.993f, 14.5f, 14.75f, 14.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 13.0f, 17.0f, 12.664f, 17.0f, 12.25f)
                curveTo(17.0f, 11.836f, 16.664f, 11.5f, 16.25f, 11.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 10.5f, 17.0f, 10.164f, 17.0f, 9.75f)
                curveTo(17.0f, 9.336f, 16.664f, 9.0f, 16.25f, 9.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                curveTo(15.414f, 8.0f, 15.75f, 7.664f, 15.75f, 7.25f)
                curveTo(15.75f, 6.836f, 15.414f, 6.5f, 15.0f, 6.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(5.75f)
                close()
                moveTo(14.75f, 16.0f)
                curveTo(15.164f, 16.0f, 15.5f, 16.336f, 15.5f, 16.75f)
                curveTo(15.5f, 17.164f, 15.164f, 17.5f, 14.75f, 17.5f)
                curveTo(14.336f, 17.5f, 14.0f, 17.164f, 14.0f, 16.75f)
                curveTo(14.0f, 16.336f, 14.336f, 16.0f, 14.75f, 16.0f)
                close()
                moveTo(8.5f, 16.75f)
                curveTo(8.5f, 16.336f, 8.836f, 16.0f, 9.25f, 16.0f)
                curveTo(9.664f, 16.0f, 10.0f, 16.336f, 10.0f, 16.75f)
                curveTo(10.0f, 17.164f, 9.664f, 17.5f, 9.25f, 17.5f)
                curveTo(8.836f, 17.5f, 8.5f, 17.164f, 8.5f, 16.75f)
                close()
                moveTo(7.25f, 2.0f)
                curveTo(5.455f, 2.0f, 4.0f, 3.455f, 4.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(4.0f, 20.545f, 5.455f, 22.0f, 7.25f, 22.0f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 22.0f, 20.0f, 20.545f, 20.0f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(20.0f, 3.455f, 18.545f, 2.0f, 16.75f, 2.0f)
                horizontalLineTo(7.25f)
                close()
                moveTo(5.5f, 5.25f)
                curveTo(5.5f, 4.284f, 6.284f, 3.5f, 7.25f, 3.5f)
                horizontalLineTo(16.75f)
                curveTo(17.716f, 3.5f, 18.5f, 4.284f, 18.5f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.716f, 17.716f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(6.284f, 20.5f, 5.5f, 19.716f, 5.5f, 18.75f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _xray!!
    }

@Suppress("ObjectPropertyName")
private var _xray: ImageVector? = null

@Preview
@Composable
private fun XrayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Xray, contentDescription = "Xray Icon")
    }
}

