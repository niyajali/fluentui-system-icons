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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.BranchForkHint: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BranchForkHint",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 2f)
            curveTo(4.567f, 2f, 3f, 3.567f, 3f, 5.5f)
            curveTo(3f, 7.086f, 4.054f, 8.425f, 5.5f, 8.855f)
            verticalLineTo(14.25f)
            curveTo(5.5f, 14.664f, 5.836f, 15f, 6.25f, 15f)
            curveTo(6.664f, 15f, 7f, 14.664f, 7f, 14.25f)
            verticalLineTo(13f)
            horizontalLineTo(13.25f)
            curveTo(15.321f, 13f, 17f, 11.321f, 17f, 9.25f)
            verticalLineTo(8.965f)
            curveTo(18.696f, 8.722f, 20f, 7.263f, 20f, 5.5f)
            curveTo(20f, 3.567f, 18.433f, 2f, 16.5f, 2f)
            curveTo(14.567f, 2f, 13f, 3.567f, 13f, 5.5f)
            curveTo(13f, 7.086f, 14.054f, 8.425f, 15.5f, 8.855f)
            verticalLineTo(9.25f)
            curveTo(15.5f, 10.493f, 14.493f, 11.5f, 13.25f, 11.5f)
            horizontalLineTo(7f)
            verticalLineTo(8.965f)
            curveTo(8.696f, 8.722f, 10f, 7.263f, 10f, 5.5f)
            curveTo(10f, 3.567f, 8.433f, 2f, 6.5f, 2f)
            close()
            moveTo(5.341f, 16.885f)
            curveTo(5.678f, 16.644f, 5.756f, 16.175f, 5.515f, 15.838f)
            curveTo(5.274f, 15.501f, 4.806f, 15.423f, 4.469f, 15.664f)
            curveTo(4.314f, 15.775f, 4.166f, 15.9f, 4.028f, 16.038f)
            curveTo(3.672f, 16.394f, 3.408f, 16.809f, 3.238f, 17.252f)
            curveTo(3.089f, 17.639f, 3.281f, 18.073f, 3.668f, 18.222f)
            curveTo(4.054f, 18.37f, 4.488f, 18.178f, 4.637f, 17.791f)
            curveTo(4.734f, 17.54f, 4.884f, 17.304f, 5.089f, 17.099f)
            curveTo(5.169f, 17.019f, 5.253f, 16.948f, 5.341f, 16.885f)
            close()
            moveTo(8.531f, 15.664f)
            curveTo(8.194f, 15.423f, 7.726f, 15.501f, 7.485f, 15.838f)
            curveTo(7.244f, 16.175f, 7.322f, 16.644f, 7.659f, 16.885f)
            curveTo(7.747f, 16.948f, 7.831f, 17.019f, 7.911f, 17.099f)
            curveTo(8.116f, 17.304f, 8.266f, 17.54f, 8.363f, 17.791f)
            curveTo(8.512f, 18.178f, 8.946f, 18.37f, 9.332f, 18.222f)
            curveTo(9.719f, 18.073f, 9.911f, 17.639f, 9.762f, 17.252f)
            curveTo(9.592f, 16.809f, 9.328f, 16.394f, 8.972f, 16.038f)
            curveTo(8.834f, 15.9f, 8.686f, 15.775f, 8.531f, 15.664f)
            close()
            moveTo(4.777f, 19.519f)
            curveTo(4.567f, 19.162f, 4.108f, 19.042f, 3.751f, 19.252f)
            curveTo(3.393f, 19.461f, 3.274f, 19.921f, 3.483f, 20.278f)
            curveTo(3.631f, 20.53f, 3.813f, 20.767f, 4.028f, 20.982f)
            curveTo(4.306f, 21.26f, 4.621f, 21.483f, 4.957f, 21.648f)
            curveTo(5.329f, 21.831f, 5.778f, 21.678f, 5.961f, 21.306f)
            curveTo(6.144f, 20.934f, 5.991f, 20.485f, 5.619f, 20.302f)
            curveTo(5.428f, 20.208f, 5.249f, 20.082f, 5.089f, 19.922f)
            curveTo(4.965f, 19.798f, 4.861f, 19.662f, 4.777f, 19.519f)
            close()
            moveTo(9.517f, 20.278f)
            curveTo(9.726f, 19.921f, 9.607f, 19.461f, 9.25f, 19.252f)
            curveTo(8.892f, 19.042f, 8.433f, 19.162f, 8.223f, 19.519f)
            curveTo(8.139f, 19.662f, 8.035f, 19.798f, 7.911f, 19.922f)
            curveTo(7.751f, 20.082f, 7.572f, 20.208f, 7.381f, 20.302f)
            curveTo(7.009f, 20.485f, 6.856f, 20.934f, 7.039f, 21.306f)
            curveTo(7.222f, 21.678f, 7.671f, 21.831f, 8.043f, 21.648f)
            curveTo(8.379f, 21.483f, 8.694f, 21.26f, 8.972f, 20.982f)
            curveTo(9.187f, 20.767f, 9.369f, 20.53f, 9.517f, 20.278f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BranchForkHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BranchForkHint, contentDescription = null)
    }
}
