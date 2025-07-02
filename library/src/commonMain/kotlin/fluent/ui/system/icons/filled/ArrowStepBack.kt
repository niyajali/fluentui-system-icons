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
 * ArrowStepBack icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, step, back
 * - Source: ic_fluent_arrow_step_back_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowStepBack icon.
 */
public val FluentIcons.Filled.ArrowStepBack: ImageVector
    get() {
        if (_arrowStepBack != null) {
            return _arrowStepBack!!
        }
        _arrowStepBack = Builder(name = "ArrowStepBack", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.851f, 3.146f)
                curveTo(8.046f, 3.342f, 8.046f, 3.658f, 7.851f, 3.853f)
                lineTo(4.706f, 7.0f)
                horizontalLineTo(10.0f)
                curveTo(12.932f, 7.0f, 15.593f, 8.64f, 16.936f, 11.043f)
                curveTo(17.071f, 11.284f, 16.985f, 11.588f, 16.744f, 11.723f)
                curveTo(16.503f, 11.858f, 16.198f, 11.772f, 16.064f, 11.531f)
                curveTo(14.894f, 9.439f, 12.564f, 8.0f, 10.0f, 8.0f)
                horizontalLineTo(4.707f)
                lineTo(7.851f, 11.145f)
                curveTo(8.046f, 11.341f, 8.046f, 11.657f, 7.851f, 11.852f)
                curveTo(7.656f, 12.048f, 7.339f, 12.048f, 7.144f, 11.852f)
                lineTo(3.161f, 7.867f)
                curveTo(3.062f, 7.776f, 3.0f, 7.645f, 3.0f, 7.5f)
                curveTo(3.0f, 7.5f, 3.0f, 7.5f, 3.0f, 7.5f)
                curveTo(3.0f, 7.372f, 3.049f, 7.244f, 3.146f, 7.146f)
                lineTo(7.144f, 3.147f)
                curveTo(7.339f, 2.951f, 7.656f, 2.951f, 7.851f, 3.146f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(12.0f, 16.105f, 11.105f, 17.0f, 10.0f, 17.0f)
                curveTo(8.895f, 17.0f, 8.0f, 16.105f, 8.0f, 15.0f)
                curveTo(8.0f, 13.895f, 8.895f, 13.0f, 10.0f, 13.0f)
                curveTo(11.105f, 13.0f, 12.0f, 13.895f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _arrowStepBack!!
    }

@Suppress("ObjectPropertyName")
private var _arrowStepBack: ImageVector? = null

@Preview
@Composable
private fun ArrowStepBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowStepBack, contentDescription = null)
    }
}

