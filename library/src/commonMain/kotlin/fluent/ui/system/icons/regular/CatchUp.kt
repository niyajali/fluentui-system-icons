/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CatchUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CatchUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.278f, 8.157f)
            curveTo(9.362f, 7.951f, 9.654f, 7.95f, 9.74f, 8.156f)
            lineTo(12.976f, 15.922f)
            curveTo(13.55f, 17.299f, 15.473f, 17.373f, 16.15f, 16.045f)
            lineTo(17.75f, 12.909f)
            curveTo(17.879f, 12.658f, 18.137f, 12.5f, 18.419f, 12.5f)
            horizontalLineTo(19.063f)
            curveTo(19.285f, 13.362f, 20.068f, 14f, 21f, 14f)
            curveTo(22.105f, 14f, 23f, 13.104f, 23f, 12f)
            curveTo(23f, 10.895f, 22.105f, 10f, 21f, 10f)
            curveTo(20.26f, 10f, 19.613f, 10.402f, 19.268f, 11f)
            horizontalLineTo(18.419f)
            curveTo(17.573f, 11f, 16.799f, 11.474f, 16.414f, 12.227f)
            lineTo(14.814f, 15.363f)
            curveTo(14.717f, 15.553f, 14.443f, 15.542f, 14.361f, 15.345f)
            lineTo(11.125f, 7.579f)
            curveTo(10.524f, 6.138f, 8.48f, 6.145f, 7.889f, 7.59f)
            lineTo(6.687f, 10.533f)
            curveTo(6.572f, 10.816f, 6.297f, 11f, 5.992f, 11f)
            horizontalLineTo(4.732f)
            curveTo(4.387f, 10.402f, 3.74f, 10f, 3f, 10f)
            curveTo(1.895f, 10f, 1f, 10.895f, 1f, 12f)
            curveTo(1f, 13.104f, 1.895f, 14f, 3f, 14f)
            curveTo(3.932f, 14f, 4.715f, 13.362f, 4.937f, 12.5f)
            horizontalLineTo(5.992f)
            curveTo(6.906f, 12.5f, 7.73f, 11.947f, 8.075f, 11.101f)
            lineTo(9.278f, 8.157f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CatchUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CatchUp, contentDescription = null)
    }
}
