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
 * Counter Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_counter_24_filled.svg)
 * 
 * @return The [ImageVector] for the Counter icon.
 */
public val FluentIcons.Filled.Counter: ImageVector
    get() {
        if (_counter != null) {
            return _counter!!
        }
        _counter = Builder(name = "Counter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.55f, 4.0f)
                curveTo(14.517f, 4.162f, 14.5f, 4.329f, 14.5f, 4.5f)
                verticalLineTo(7.5f)
                curveTo(14.5f, 8.881f, 15.619f, 10.0f, 17.0f, 10.0f)
                curveTo(18.381f, 10.0f, 19.5f, 8.881f, 19.5f, 7.5f)
                verticalLineTo(4.5f)
                curveTo(19.5f, 4.34f, 19.484f, 4.185f, 19.455f, 4.033f)
                curveTo(20.896f, 4.252f, 22.0f, 5.498f, 22.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.605f, 20.739f, 19.916f, 19.154f, 19.996f)
                lineTo(19.0f, 20.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(13.75f)
                curveTo(18.5f, 13.42f, 18.284f, 13.128f, 17.968f, 13.032f)
                curveTo(17.662f, 12.94f, 17.333f, 13.052f, 17.146f, 13.309f)
                curveTo(17.141f, 13.314f, 17.137f, 13.319f, 17.133f, 13.324f)
                lineTo(17.125f, 13.335f)
                curveTo(17.118f, 13.345f, 17.104f, 13.363f, 17.083f, 13.388f)
                curveTo(17.041f, 13.438f, 16.973f, 13.511f, 16.881f, 13.592f)
                curveTo(16.695f, 13.754f, 16.424f, 13.934f, 16.068f, 14.023f)
                curveTo(15.667f, 14.123f, 15.422f, 14.53f, 15.523f, 14.932f)
                curveTo(15.623f, 15.333f, 16.03f, 15.578f, 16.432f, 15.477f)
                curveTo(16.638f, 15.426f, 16.827f, 15.356f, 17.0f, 15.278f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.55f)
                close()
                moveTo(7.0f, 9.5f)
                curveTo(7.552f, 9.5f, 8.0f, 9.948f, 8.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(8.0f, 14.052f, 7.552f, 14.5f, 7.0f, 14.5f)
                curveTo(6.448f, 14.5f, 6.0f, 14.052f, 6.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(6.0f, 9.948f, 6.448f, 9.5f, 7.0f, 9.5f)
                close()
                moveTo(11.25f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                lineTo(4.846f, 19.996f)
                curveTo(3.261f, 19.916f, 2.0f, 18.605f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.343f, 3.343f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(7.0f, 8.0f)
                curveTo(5.619f, 8.0f, 4.5f, 9.119f, 4.5f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(4.5f, 14.881f, 5.619f, 16.0f, 7.0f, 16.0f)
                curveTo(8.381f, 16.0f, 9.5f, 14.881f, 9.5f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(9.5f, 9.119f, 8.381f, 8.0f, 7.0f, 8.0f)
                close()
                moveTo(17.865f, 4.0f)
                curveTo(17.951f, 4.147f, 18.0f, 4.318f, 18.0f, 4.5f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 8.052f, 17.552f, 8.5f, 17.0f, 8.5f)
                curveTo(16.448f, 8.5f, 16.0f, 8.052f, 16.0f, 7.5f)
                verticalLineTo(4.5f)
                curveTo(16.0f, 4.318f, 16.049f, 4.147f, 16.135f, 4.0f)
                horizontalLineTo(17.865f)
                close()
            }
        }
        .build()
        return _counter!!
    }

@Suppress("ObjectPropertyName")
private var _counter: ImageVector? = null

@Preview
@Composable
private fun CounterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Counter, contentDescription = "Counter Icon")
    }
}

