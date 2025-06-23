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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.VehicleTractor: ImageVector
    get() {
        if (_VehicleTractor != null) {
            return _VehicleTractor!!
        }
        _VehicleTractor = ImageVector.Builder(
            name = "Filled.VehicleTractor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.021f, 3f)
                curveTo(5.921f, 3f, 4.982f, 3.795f, 4.801f, 4.88f)
                lineTo(3.979f, 9.815f)
                curveTo(2.197f, 10.855f, 1f, 12.788f, 1f, 15f)
                curveTo(1f, 18.314f, 3.686f, 21f, 7f, 21f)
                curveTo(9.612f, 21f, 11.835f, 19.33f, 12.659f, 17f)
                horizontalLineTo(16.035f)
                curveTo(16.012f, 17.163f, 16f, 17.33f, 16f, 17.5f)
                curveTo(16f, 19.433f, 17.567f, 21f, 19.5f, 21f)
                curveTo(21.433f, 21f, 23f, 19.433f, 23f, 17.5f)
                curveTo(23f, 16.547f, 22.619f, 15.683f, 22.001f, 15.052f)
                verticalLineTo(12.25f)
                curveTo(22.001f, 10.455f, 20.546f, 9f, 18.751f, 9f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.75f)
                curveTo(17.5f, 6.336f, 17.164f, 6f, 16.75f, 6f)
                curveTo(16.336f, 6f, 16f, 6.336f, 16f, 6.75f)
                verticalLineTo(9f)
                horizontalLineTo(13.885f)
                lineTo(13.199f, 4.88f)
                curveTo(13.018f, 3.795f, 12.079f, 3f, 10.979f, 3f)
                horizontalLineTo(7.021f)
                close()
                moveTo(7.038f, 9f)
                curveTo(7.025f, 9f, 7.013f, 9f, 7f, 9f)
                curveTo(6.521f, 9f, 6.055f, 9.056f, 5.608f, 9.162f)
                lineTo(6.281f, 5.127f)
                curveTo(6.341f, 4.765f, 6.654f, 4.5f, 7.021f, 4.5f)
                horizontalLineTo(10.979f)
                curveTo(11.346f, 4.5f, 11.659f, 4.765f, 11.719f, 5.127f)
                lineTo(12.365f, 9f)
                horizontalLineTo(7.066f)
                curveTo(7.057f, 9f, 7.047f, 9f, 7.038f, 9f)
                close()
                moveTo(19.5f, 15.5f)
                curveTo(20.605f, 15.5f, 21.5f, 16.395f, 21.5f, 17.5f)
                curveTo(21.5f, 18.605f, 20.605f, 19.5f, 19.5f, 19.5f)
                curveTo(18.395f, 19.5f, 17.5f, 18.605f, 17.5f, 17.5f)
                curveTo(17.5f, 16.395f, 18.395f, 15.5f, 19.5f, 15.5f)
                close()
                moveTo(2.5f, 15f)
                curveTo(2.5f, 12.515f, 4.515f, 10.5f, 7f, 10.5f)
                curveTo(9.485f, 10.5f, 11.5f, 12.515f, 11.5f, 15f)
                curveTo(11.5f, 17.485f, 9.485f, 19.5f, 7f, 19.5f)
                curveTo(4.515f, 19.5f, 2.5f, 17.485f, 2.5f, 15f)
                close()
            }
        }.build()

        return _VehicleTractor!!
    }

@Suppress("ObjectPropertyName")
private var _VehicleTractor: ImageVector? = null

@Preview
@Composable
private fun VehicleTractorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VehicleTractor, contentDescription = null)
    }
}
