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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.CollectionsEmpty: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CollectionsEmpty",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.113f, 8.8f)
            curveTo(9.452f, 8.503f, 9.857f, 8.274f, 10.303f, 8.139f)
            lineTo(10.55f, 8.074f)
            lineTo(10.71f, 8.043f)
            lineTo(10.886f, 8.019f)
            lineTo(11.066f, 8.004f)
            lineTo(11.25f, 7.999f)
            horizontalLineTo(18.75f)
            curveTo(20.483f, 7.999f, 21.899f, 9.355f, 21.995f, 11.064f)
            lineTo(22f, 11.249f)
            verticalLineTo(18.749f)
            curveTo(22f, 20.482f, 20.643f, 21.898f, 18.934f, 21.994f)
            lineTo(18.75f, 21.999f)
            horizontalLineTo(11.25f)
            curveTo(9.517f, 21.999f, 8.101f, 20.642f, 8.005f, 18.933f)
            lineTo(8f, 18.749f)
            verticalLineTo(11.249f)
            lineTo(8.017f, 10.91f)
            lineTo(8.079f, 10.533f)
            lineTo(8.138f, 10.31f)
            lineTo(8.219f, 10.074f)
            lineTo(8.305f, 9.872f)
            lineTo(8.387f, 9.71f)
            lineTo(8.481f, 9.547f)
            lineTo(8.627f, 9.33f)
            lineTo(8.721f, 9.207f)
            lineTo(8.856f, 9.051f)
            lineTo(8.964f, 8.939f)
            lineTo(9.113f, 8.8f)
            close()
            moveTo(15.582f, 4.233f)
            lineTo(15.634f, 4.41f)
            lineTo(16.328f, 6.998f)
            lineTo(11.25f, 6.999f)
            curveTo(8.903f, 6.999f, 7f, 8.902f, 7f, 11.249f)
            lineTo(7.001f, 17.682f)
            curveTo(5.699f, 17.605f, 4.53f, 16.744f, 4.105f, 15.454f)
            lineTo(4.053f, 15.278f)
            lineTo(2.112f, 8.033f)
            curveTo(1.663f, 6.359f, 2.607f, 4.64f, 4.233f, 4.105f)
            lineTo(4.41f, 4.053f)
            lineTo(11.654f, 2.112f)
            curveTo(13.328f, 1.663f, 15.047f, 2.607f, 15.582f, 4.233f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CollectionsEmptyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CollectionsEmpty, contentDescription = null)
    }
}
