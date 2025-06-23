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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.GlobeArrowForward: ImageVector
    get() {
        if (_GlobeArrowForward != null) {
            return _GlobeArrowForward!!
        }
        _GlobeArrowForward = ImageVector.Builder(
            name = "Regular.GlobeArrowForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22.001f, 6.478f, 22.001f, 12.002f)
                curveTo(22.001f, 12.264f, 21.991f, 12.525f, 21.971f, 12.782f)
                curveTo(21.533f, 12.367f, 21.037f, 12.012f, 20.497f, 11.731f)
                curveTo(20.478f, 11.137f, 20.399f, 10.558f, 20.264f, 10f)
                lineTo(16.906f, 10.001f)
                curveTo(16.938f, 10.335f, 16.963f, 10.675f, 16.979f, 11.021f)
                curveTo(16.463f, 11.061f, 15.964f, 11.163f, 15.489f, 11.317f)
                curveTo(15.473f, 10.867f, 15.442f, 10.427f, 15.396f, 10.001f)
                horizontalLineTo(8.603f)
                curveTo(8.535f, 10.641f, 8.498f, 11.311f, 8.498f, 12.002f)
                curveTo(8.498f, 13.061f, 8.584f, 14.071f, 8.738f, 15.002f)
                horizontalLineTo(11.497f)
                curveTo(11.3f, 15.476f, 11.156f, 15.978f, 11.076f, 16.501f)
                horizontalLineTo(9.061f)
                curveTo(9.659f, 18.718f, 10.664f, 20.238f, 11.717f, 20.472f)
                curveTo(12.001f, 21.022f, 12.361f, 21.528f, 12.783f, 21.973f)
                curveTo(12.525f, 21.993f, 12.263f, 22.003f, 12f, 22.003f)
                curveTo(6.476f, 22.003f, 1.998f, 17.525f, 1.998f, 12.002f)
                curveTo(1.998f, 6.478f, 6.476f, 2f, 12f, 2f)
                close()
                moveTo(7.508f, 16.502f)
                lineTo(4.785f, 16.502f)
                curveTo(5.744f, 18.035f, 7.177f, 19.24f, 8.88f, 19.912f)
                curveTo(8.357f, 19.093f, 7.926f, 18.066f, 7.609f, 16.897f)
                lineTo(7.508f, 16.502f)
                close()
                moveTo(7.093f, 10.001f)
                horizontalLineTo(3.735f)
                lineTo(3.731f, 10.018f)
                curveTo(3.579f, 10.655f, 3.498f, 11.319f, 3.498f, 12.002f)
                curveTo(3.498f, 13.058f, 3.691f, 14.069f, 4.043f, 15.002f)
                lineTo(7.216f, 15.002f)
                curveTo(7.073f, 14.052f, 6.998f, 13.044f, 6.998f, 12.002f)
                curveTo(6.998f, 11.318f, 7.031f, 10.648f, 7.093f, 10.001f)
                close()
                moveTo(8.881f, 4.091f)
                lineTo(8.858f, 4.099f)
                curveTo(6.81f, 4.914f, 5.154f, 6.501f, 4.25f, 8.501f)
                lineTo(7.298f, 8.502f)
                curveTo(7.611f, 6.749f, 8.158f, 5.223f, 8.881f, 4.091f)
                close()
                moveTo(12f, 3.5f)
                lineTo(11.884f, 3.505f)
                curveTo(10.618f, 3.621f, 9.396f, 5.623f, 8.828f, 8.501f)
                horizontalLineTo(15.171f)
                curveTo(14.605f, 5.631f, 13.387f, 3.632f, 12.126f, 3.506f)
                lineTo(12f, 3.5f)
                close()
                moveTo(15.12f, 4.091f)
                lineTo(15.226f, 4.265f)
                curveTo(15.896f, 5.377f, 16.404f, 6.837f, 16.701f, 8.502f)
                lineTo(19.749f, 8.501f)
                curveTo(18.885f, 6.59f, 17.334f, 5.055f, 15.411f, 4.212f)
                lineTo(15.12f, 4.091f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.537f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.537f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(18.646f, 15.354f)
                curveTo(18.451f, 15.158f, 18.451f, 14.842f, 18.646f, 14.646f)
                curveTo(18.841f, 14.451f, 19.158f, 14.451f, 19.353f, 14.646f)
                lineTo(20.853f, 16.146f)
                curveTo(21.048f, 16.342f, 21.048f, 16.658f, 20.853f, 16.854f)
                lineTo(19.353f, 18.354f)
                curveTo(19.158f, 18.549f, 18.841f, 18.549f, 18.646f, 18.354f)
                curveTo(18.451f, 18.158f, 18.451f, 17.842f, 18.646f, 17.646f)
                lineTo(19.292f, 17f)
                horizontalLineTo(17.25f)
                curveTo(16.007f, 17f, 15f, 18.007f, 15f, 19.25f)
                verticalLineTo(19.5f)
                curveTo(15f, 19.776f, 14.776f, 20f, 14.5f, 20f)
                curveTo(14.223f, 20f, 14f, 19.776f, 14f, 19.5f)
                verticalLineTo(19.25f)
                curveTo(14f, 17.455f, 15.455f, 16f, 17.25f, 16f)
                horizontalLineTo(19.292f)
                lineTo(18.646f, 15.354f)
                close()
            }
        }.build()

        return _GlobeArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeArrowForward: ImageVector? = null

@Preview
@Composable
private fun GlobeArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GlobeArrowForward, contentDescription = null)
    }
}
