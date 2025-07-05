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
 * ArrowStepOver Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for debugging scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_step_over_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowStepOver icon.
 */
public val FluentIcons.Regular.ArrowStepOver: ImageVector
    get() {
        if (_arrowStepOver != null) {
            return _arrowStepOver!!
        }
        _arrowStepOver = Builder(name = "ArrowStepOver", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.149f, 3.146f)
                curveTo(11.954f, 3.342f, 11.954f, 3.658f, 12.149f, 3.853f)
                lineTo(15.294f, 7.0f)
                horizontalLineTo(10.0f)
                curveTo(7.068f, 7.0f, 4.407f, 8.64f, 3.064f, 11.043f)
                curveTo(2.929f, 11.284f, 3.015f, 11.588f, 3.256f, 11.723f)
                curveTo(3.497f, 11.858f, 3.802f, 11.772f, 3.937f, 11.531f)
                curveTo(5.106f, 9.439f, 7.436f, 8.0f, 10.0f, 8.0f)
                horizontalLineTo(15.293f)
                lineTo(12.149f, 11.145f)
                curveTo(11.954f, 11.341f, 11.954f, 11.657f, 12.149f, 11.852f)
                curveTo(12.344f, 12.048f, 12.661f, 12.048f, 12.856f, 11.852f)
                lineTo(16.84f, 7.867f)
                curveTo(16.938f, 7.776f, 17.0f, 7.645f, 17.0f, 7.5f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 7.372f, 16.951f, 7.244f, 16.854f, 7.146f)
                lineTo(12.856f, 3.147f)
                curveTo(12.661f, 2.951f, 12.344f, 2.951f, 12.149f, 3.146f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(12.0f, 13.895f, 11.105f, 13.0f, 10.0f, 13.0f)
                curveTo(8.896f, 13.0f, 8.0f, 13.895f, 8.0f, 15.0f)
                curveTo(8.0f, 16.105f, 8.896f, 17.0f, 10.0f, 17.0f)
                curveTo(11.105f, 17.0f, 12.0f, 16.105f, 12.0f, 15.0f)
                close()
                moveTo(10.0f, 14.0f)
                curveTo(10.552f, 14.0f, 11.0f, 14.448f, 11.0f, 15.0f)
                curveTo(11.0f, 15.552f, 10.552f, 16.0f, 10.0f, 16.0f)
                curveTo(9.448f, 16.0f, 9.0f, 15.552f, 9.0f, 15.0f)
                curveTo(9.0f, 14.448f, 9.448f, 14.0f, 10.0f, 14.0f)
                close()
            }
        }
        .build()
        return _arrowStepOver!!
    }

@Suppress("ObjectPropertyName")
private var _arrowStepOver: ImageVector? = null

@Preview
@Composable
private fun ArrowStepOverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowStepOver, contentDescription = "ArrowStepOver Icon")
    }
}

