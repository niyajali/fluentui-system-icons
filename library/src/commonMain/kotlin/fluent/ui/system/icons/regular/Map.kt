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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Map: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Map",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.203f, 3.999f)
            lineTo(9.25f, 3.998f)
            lineTo(9.296f, 3.999f)
            curveTo(9.319f, 4.001f, 9.341f, 4.003f, 9.364f, 4.006f)
            lineTo(9.38f, 4.01f)
            curveTo(9.465f, 4.024f, 9.55f, 4.054f, 9.631f, 4.102f)
            lineTo(9.683f, 4.136f)
            lineTo(14.753f, 7.701f)
            lineTo(19.82f, 4.139f)
            curveTo(20.288f, 3.81f, 20.921f, 4.106f, 20.994f, 4.648f)
            lineTo(21.001f, 4.753f)
            verticalLineTo(15.385f)
            curveTo(21.001f, 15.594f, 20.914f, 15.793f, 20.763f, 15.933f)
            lineTo(20.683f, 15.999f)
            lineTo(15.183f, 19.865f)
            curveTo(14.916f, 20.053f, 14.595f, 20.037f, 14.355f, 19.888f)
            lineTo(9.25f, 16.297f)
            lineTo(4.18f, 19.862f)
            curveTo(3.713f, 20.191f, 3.079f, 19.895f, 3.006f, 19.353f)
            lineTo(2.999f, 19.248f)
            verticalLineTo(8.616f)
            curveTo(2.999f, 8.406f, 3.086f, 8.208f, 3.237f, 8.068f)
            lineTo(3.318f, 8.002f)
            lineTo(8.818f, 4.136f)
            curveTo(8.882f, 4.091f, 8.949f, 4.057f, 9.017f, 4.035f)
            lineTo(9.14f, 4.007f)
            lineTo(9.203f, 3.999f)
            close()
            moveTo(19.501f, 6.197f)
            lineTo(15.501f, 9.009f)
            verticalLineTo(17.808f)
            lineTo(19.501f, 14.996f)
            verticalLineTo(6.197f)
            close()
            moveTo(8.499f, 6.193f)
            lineTo(4.499f, 9.005f)
            verticalLineTo(17.804f)
            lineTo(8.499f, 14.992f)
            verticalLineTo(6.193f)
            close()
            moveTo(10.001f, 6.193f)
            verticalLineTo(14.992f)
            lineTo(14.001f, 17.804f)
            verticalLineTo(9.005f)
            lineTo(10.001f, 6.193f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Map, contentDescription = null)
    }
}
