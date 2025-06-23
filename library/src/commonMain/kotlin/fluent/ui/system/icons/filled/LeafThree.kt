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

public val FluentIcons.Filled.LeafThree: ImageVector
    get() {
        if (_LeafThree != null) {
            return _LeafThree!!
        }
        _LeafThree = ImageVector.Builder(
            name = "Filled.LeafThree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.5f, 2f)
                curveTo(11.359f, 2f, 9.504f, 3.223f, 8.595f, 5.008f)
                curveTo(10.889f, 5.12f, 12.892f, 6.335f, 14.086f, 8.133f)
                curveTo(14.544f, 8.046f, 15.017f, 8f, 15.5f, 8f)
                horizontalLineTo(18.978f)
                curveTo(18.992f, 7.835f, 19f, 7.669f, 19f, 7.5f)
                verticalLineTo(3.441f)
                curveTo(19f, 2.645f, 18.355f, 2f, 17.559f, 2f)
                horizontalLineTo(13.5f)
                close()
                moveTo(8.426f, 17.997f)
                curveTo(8.367f, 17.999f, 8.309f, 18f, 8.25f, 18f)
                curveTo(4.936f, 18f, 2.25f, 15.314f, 2.25f, 12f)
                verticalLineTo(7.514f)
                curveTo(2.25f, 6.678f, 2.928f, 6f, 3.764f, 6f)
                horizontalLineTo(8.25f)
                curveTo(10.216f, 6f, 11.962f, 6.946f, 13.056f, 8.407f)
                curveTo(11.408f, 8.975f, 10.021f, 10.1f, 9.118f, 11.558f)
                lineTo(7.53f, 9.97f)
                curveTo(7.237f, 9.677f, 6.762f, 9.677f, 6.47f, 9.97f)
                curveTo(6.177f, 10.263f, 6.177f, 10.737f, 6.47f, 11.03f)
                lineTo(8.43f, 12.991f)
                curveTo(8.152f, 13.775f, 8f, 14.62f, 8f, 15.5f)
                curveTo(8f, 16.376f, 8.15f, 17.216f, 8.426f, 17.997f)
                close()
                moveTo(9f, 15.5f)
                curveTo(9f, 11.91f, 11.91f, 9f, 15.5f, 9f)
                horizontalLineTo(20.414f)
                curveTo(21.29f, 9f, 22f, 9.71f, 22f, 10.586f)
                verticalLineTo(15.5f)
                curveTo(22f, 19.09f, 19.09f, 22f, 15.5f, 22f)
                curveTo(13.975f, 22f, 12.573f, 21.475f, 11.465f, 20.596f)
                lineTo(10.28f, 21.78f)
                curveTo(9.988f, 22.073f, 9.513f, 22.073f, 9.22f, 21.78f)
                curveTo(8.927f, 21.487f, 8.927f, 21.013f, 9.22f, 20.72f)
                lineTo(10.404f, 19.535f)
                curveTo(9.525f, 18.427f, 9f, 17.025f, 9f, 15.5f)
                close()
                moveTo(12.177f, 19.883f)
                lineTo(16.78f, 15.28f)
                curveTo(17.073f, 14.987f, 17.073f, 14.513f, 16.78f, 14.22f)
                curveTo(16.487f, 13.927f, 16.013f, 13.927f, 15.72f, 14.22f)
                lineTo(11.117f, 18.823f)
                curveTo(11.42f, 19.223f, 11.777f, 19.58f, 12.177f, 19.883f)
                close()
            }
        }.build()

        return _LeafThree!!
    }

@Suppress("ObjectPropertyName")
private var _LeafThree: ImageVector? = null

@Preview
@Composable
private fun LeafThreePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LeafThree, contentDescription = null)
    }
}
