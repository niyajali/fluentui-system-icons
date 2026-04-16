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
 * CallChevronDown Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in call scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_call_chevron_down_24_regular.svg)
 * 
 * @return The [ImageVector] for the CallChevronDown icon.
 */
public val FluentIcons.Regular.CallChevronDown: ImageVector
    get() {
        if (_callChevronDown != null) {
            return _callChevronDown!!
        }
        _callChevronDown = Builder(name = "CallChevronDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.224f, 2.067f)
                curveTo(7.546f, 1.669f, 8.959f, 2.312f, 9.526f, 3.572f)
                lineTo(10.427f, 5.578f)
                curveTo(10.91f, 6.652f, 10.656f, 7.914f, 9.795f, 8.717f)
                lineTo(8.3f, 10.11f)
                curveTo(8.256f, 10.151f, 8.229f, 10.206f, 8.223f, 10.265f)
                curveTo(8.179f, 10.663f, 8.448f, 11.436f, 9.068f, 12.509f)
                curveTo(9.519f, 13.291f, 9.927f, 13.839f, 10.275f, 14.147f)
                curveTo(10.516f, 14.362f, 10.649f, 14.408f, 10.706f, 14.391f)
                lineTo(12.717f, 13.777f)
                curveTo(13.843f, 13.433f, 15.063f, 13.843f, 15.751f, 14.798f)
                lineTo(17.031f, 16.573f)
                curveTo(17.837f, 17.69f, 17.693f, 19.231f, 16.693f, 20.178f)
                lineTo(15.806f, 21.017f)
                curveTo(14.85f, 21.923f, 13.489f, 22.261f, 12.22f, 21.907f)
                curveTo(9.466f, 21.138f, 6.996f, 18.814f, 4.784f, 14.983f)
                curveTo(2.569f, 11.147f, 1.792f, 7.842f, 2.508f, 5.07f)
                curveTo(2.836f, 3.802f, 3.803f, 2.797f, 5.057f, 2.419f)
                lineTo(6.224f, 2.067f)
                close()
                moveTo(8.157f, 4.187f)
                curveTo(7.9f, 3.615f, 7.258f, 3.322f, 6.656f, 3.503f)
                lineTo(5.489f, 3.854f)
                curveTo(4.737f, 4.081f, 4.158f, 4.685f, 3.961f, 5.446f)
                curveTo(3.359f, 7.778f, 4.047f, 10.706f, 6.083f, 14.233f)
                curveTo(8.117f, 17.755f, 10.305f, 19.816f, 12.622f, 20.463f)
                curveTo(13.384f, 20.675f, 14.201f, 20.472f, 14.775f, 19.928f)
                lineTo(15.661f, 19.09f)
                curveTo(16.116f, 18.659f, 16.182f, 17.958f, 15.816f, 17.45f)
                lineTo(14.534f, 15.675f)
                curveTo(14.221f, 15.242f, 13.667f, 15.055f, 13.156f, 15.212f)
                lineTo(11.14f, 15.828f)
                curveTo(9.97f, 16.176f, 8.909f, 15.234f, 7.769f, 13.259f)
                curveTo(7.001f, 11.929f, 6.642f, 10.9f, 6.732f, 10.098f)
                curveTo(6.778f, 9.683f, 6.972f, 9.298f, 7.278f, 9.013f)
                lineTo(8.772f, 7.62f)
                curveTo(9.163f, 7.255f, 9.279f, 6.681f, 9.06f, 6.193f)
                lineTo(8.157f, 4.187f)
                close()
                moveTo(20.72f, 4.719f)
                curveTo(21.013f, 4.427f, 21.488f, 4.427f, 21.781f, 4.719f)
                curveTo(22.073f, 5.012f, 22.073f, 5.487f, 21.781f, 5.78f)
                lineTo(17.781f, 9.78f)
                curveTo(17.488f, 10.073f, 17.013f, 10.073f, 16.72f, 9.78f)
                lineTo(12.72f, 5.78f)
                curveTo(12.427f, 5.487f, 12.427f, 5.012f, 12.72f, 4.719f)
                curveTo(13.013f, 4.427f, 13.488f, 4.427f, 13.781f, 4.719f)
                lineTo(17.25f, 8.189f)
                lineTo(20.72f, 4.719f)
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
        Image(imageVector = FluentIcons.Regular.CallChevronDown, contentDescription = "CallChevronDown Icon")
    }
}

