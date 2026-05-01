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
 * CallChevronDown Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in call scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_call_chevron_down_24_filled.svg)
 * 
 * @return The [ImageVector] for the CallChevronDown icon.
 */
public val FluentIcons.Filled.CallChevronDown: ImageVector
    get() {
        if (_callChevronDown != null) {
            return _callChevronDown!!
        }
        _callChevronDown = Builder(name = "CallChevronDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.85f, 2.095f)
                curveTo(7.858f, 1.772f, 8.936f, 2.294f, 9.368f, 3.312f)
                lineTo(10.229f, 5.34f)
                curveTo(10.603f, 6.223f, 10.394f, 7.262f, 9.714f, 7.908f)
                lineTo(7.82f, 9.706f)
                curveTo(7.937f, 10.782f, 8.298f, 11.841f, 8.904f, 12.884f)
                curveTo(9.51f, 13.926f, 10.268f, 14.791f, 11.176f, 15.478f)
                lineTo(13.45f, 14.719f)
                curveTo(14.313f, 14.431f, 15.252f, 14.762f, 15.781f, 15.539f)
                lineTo(17.014f, 17.35f)
                curveTo(17.629f, 18.253f, 17.518f, 19.5f, 16.755f, 20.266f)
                lineTo(15.938f, 21.086f)
                curveTo(15.124f, 21.903f, 13.961f, 22.2f, 12.886f, 21.864f)
                curveTo(10.347f, 21.072f, 8.013f, 18.721f, 5.883f, 14.811f)
                curveTo(3.75f, 10.894f, 2.997f, 7.572f, 3.624f, 4.843f)
                curveTo(3.888f, 3.695f, 4.706f, 2.781f, 5.773f, 2.439f)
                lineTo(6.85f, 2.095f)
                close()
                moveTo(20.72f, 4.72f)
                curveTo(21.013f, 4.427f, 21.487f, 4.427f, 21.78f, 4.72f)
                curveTo(22.073f, 5.013f, 22.073f, 5.487f, 21.78f, 5.78f)
                lineTo(17.78f, 9.78f)
                curveTo(17.487f, 10.073f, 17.013f, 10.073f, 16.72f, 9.78f)
                lineTo(12.72f, 5.78f)
                curveTo(12.427f, 5.487f, 12.427f, 5.013f, 12.72f, 4.72f)
                curveTo(13.012f, 4.427f, 13.487f, 4.427f, 13.78f, 4.72f)
                lineTo(17.25f, 8.189f)
                lineTo(20.72f, 4.72f)
                close()
            }
        }
        .build()
        return _callChevronDown!!
    }

@Suppress("ObjectPropertyName")
private var _callChevronDown: ImageVector? = null

@Preview
@Composable
private fun CallChevronDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallChevronDown, contentDescription = "CallChevronDown Icon")
    }
}

