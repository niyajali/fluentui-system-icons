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

public val FluentIcons.Filled.PlantRagweed: ImageVector
    get() {
        if (_PlantRagweed != null) {
            return _PlantRagweed!!
        }
        _PlantRagweed = ImageVector.Builder(
            name = "Filled.PlantRagweed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(10.343f, 2f, 9f, 3.343f, 9f, 5f)
                curveTo(9f, 5.184f, 9.017f, 5.365f, 9.049f, 5.541f)
                curveTo(7.883f, 5.753f, 7f, 6.773f, 7f, 8f)
                curveTo(7f, 8.681f, 7.273f, 9.299f, 7.715f, 9.75f)
                curveTo(7.273f, 10.201f, 7f, 10.819f, 7f, 11.5f)
                curveTo(7f, 12.881f, 8.119f, 14f, 9.5f, 14f)
                horizontalLineTo(11.25f)
                verticalLineTo(18.689f)
                lineTo(7.78f, 15.22f)
                curveTo(7.487f, 14.927f, 7.013f, 14.927f, 6.72f, 15.22f)
                curveTo(6.427f, 15.513f, 6.427f, 15.987f, 6.72f, 16.28f)
                lineTo(11.25f, 20.811f)
                verticalLineTo(22.25f)
                curveTo(11.25f, 22.664f, 11.586f, 23f, 12f, 23f)
                curveTo(12.414f, 23f, 12.75f, 22.664f, 12.75f, 22.25f)
                verticalLineTo(20.811f)
                lineTo(17.28f, 16.28f)
                curveTo(17.573f, 15.987f, 17.573f, 15.513f, 17.28f, 15.22f)
                curveTo(16.987f, 14.927f, 16.513f, 14.927f, 16.22f, 15.22f)
                lineTo(12.75f, 18.689f)
                verticalLineTo(14f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 14f, 17f, 12.881f, 17f, 11.5f)
                curveTo(17f, 10.819f, 16.727f, 10.201f, 16.285f, 9.75f)
                curveTo(16.727f, 9.299f, 17f, 8.681f, 17f, 8f)
                curveTo(17f, 6.773f, 16.117f, 5.753f, 14.951f, 5.541f)
                curveTo(14.983f, 5.365f, 15f, 5.184f, 15f, 5f)
                curveTo(15f, 3.343f, 13.657f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _PlantRagweed!!
    }

@Suppress("ObjectPropertyName")
private var _PlantRagweed: ImageVector? = null

@Preview
@Composable
private fun PlantRagweedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PlantRagweed, contentDescription = null)
    }
}
