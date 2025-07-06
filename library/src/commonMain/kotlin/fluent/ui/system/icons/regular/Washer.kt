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
 * Washer Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a washer & dryer.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_washer_24_regular.svg)
 * 
 * @return The [ImageVector] for the Washer icon.
 */
public val FluentIcons.Regular.Washer: ImageVector
    get() {
        if (_washer != null) {
            return _washer!!
        }
        _washer = Builder(name = "Washer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveTo(9.101f, 8.0f, 6.75f, 10.351f, 6.75f, 13.25f)
                curveTo(6.75f, 16.149f, 9.101f, 18.5f, 12.0f, 18.5f)
                curveTo(14.899f, 18.5f, 17.25f, 16.149f, 17.25f, 13.25f)
                curveTo(17.25f, 10.351f, 14.899f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(8.25f, 13.25f)
                curveTo(8.25f, 11.179f, 9.929f, 9.5f, 12.0f, 9.5f)
                curveTo(14.009f, 9.5f, 15.648f, 11.079f, 15.745f, 13.064f)
                curveTo(15.569f, 13.233f, 15.361f, 13.396f, 15.058f, 13.527f)
                curveTo(14.524f, 13.758f, 13.642f, 13.895f, 12.121f, 13.515f)
                curveTo(10.424f, 13.091f, 9.28f, 13.343f, 8.48f, 13.839f)
                curveTo(8.423f, 13.875f, 8.368f, 13.911f, 8.315f, 13.948f)
                curveTo(8.272f, 13.722f, 8.25f, 13.489f, 8.25f, 13.25f)
                close()
                moveTo(9.0f, 6.25f)
                curveTo(9.0f, 6.802f, 8.552f, 7.25f, 8.0f, 7.25f)
                curveTo(7.448f, 7.25f, 7.0f, 6.802f, 7.0f, 6.25f)
                curveTo(7.0f, 5.698f, 7.448f, 5.25f, 8.0f, 5.25f)
                curveTo(8.552f, 5.25f, 9.0f, 5.698f, 9.0f, 6.25f)
                close()
                moveTo(12.75f, 5.5f)
                curveTo(12.336f, 5.5f, 12.0f, 5.836f, 12.0f, 6.25f)
                curveTo(12.0f, 6.664f, 12.336f, 7.0f, 12.75f, 7.0f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 7.0f, 17.0f, 6.664f, 17.0f, 6.25f)
                curveTo(17.0f, 5.836f, 16.664f, 5.5f, 16.25f, 5.5f)
                horizontalLineTo(12.75f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21.0f, 21.0f, 19.545f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _washer!!
    }

@Suppress("ObjectPropertyName")
private var _washer: ImageVector? = null

@Preview
@Composable
private fun WasherPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Washer, contentDescription = "Washer Icon")
    }
}

