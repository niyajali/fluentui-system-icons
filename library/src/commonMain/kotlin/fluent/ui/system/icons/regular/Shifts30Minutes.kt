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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Shifts30Minutes: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Shifts30Minutes",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.5f, 5.5f)
            curveTo(15.5f, 3.567f, 13.933f, 2f, 12f, 2f)
            curveTo(10.067f, 2f, 8.5f, 3.567f, 8.5f, 5.5f)
            curveTo(8.5f, 7.433f, 10.067f, 9f, 12f, 9f)
            curveTo(13.933f, 9f, 15.5f, 7.433f, 15.5f, 5.5f)
            close()
            moveTo(10f, 5.5f)
            curveTo(10f, 4.395f, 10.895f, 3.5f, 12f, 3.5f)
            curveTo(13.105f, 3.5f, 14f, 4.395f, 14f, 5.5f)
            curveTo(14f, 6.605f, 13.105f, 7.5f, 12f, 7.5f)
            curveTo(10.895f, 7.5f, 10f, 6.605f, 10f, 5.5f)
            close()
            moveTo(8.75f, 10f)
            curveTo(7.507f, 10f, 6.5f, 11.007f, 6.5f, 12.25f)
            verticalLineTo(12.75f)
            curveTo(6.5f, 13.164f, 6.836f, 13.5f, 7.25f, 13.5f)
            curveTo(7.664f, 13.5f, 8f, 13.164f, 8f, 12.75f)
            verticalLineTo(12.25f)
            curveTo(8f, 11.836f, 8.336f, 11.5f, 8.75f, 11.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 11.5f, 16f, 11.836f, 16f, 12.25f)
            verticalLineTo(12.75f)
            curveTo(16f, 13.164f, 16.336f, 13.5f, 16.75f, 13.5f)
            curveTo(17.164f, 13.5f, 17.5f, 13.164f, 17.5f, 12.75f)
            verticalLineTo(12.25f)
            curveTo(17.5f, 11.007f, 16.493f, 10f, 15.25f, 10f)
            horizontalLineTo(8.75f)
            close()
            moveTo(6.497f, 16.999f)
            curveTo(6.497f, 17.55f, 6.05f, 17.997f, 5.499f, 17.997f)
            curveTo(4.947f, 17.997f, 4.5f, 17.55f, 4.5f, 16.999f)
            curveTo(4.5f, 16.447f, 4.947f, 16f, 5.499f, 16f)
            curveTo(6.05f, 16f, 6.497f, 16.447f, 6.497f, 16.999f)
            close()
            moveTo(5.499f, 21.497f)
            curveTo(6.05f, 21.497f, 6.497f, 21.05f, 6.497f, 20.499f)
            curveTo(6.497f, 19.947f, 6.05f, 19.5f, 5.499f, 19.5f)
            curveTo(4.947f, 19.5f, 4.5f, 19.947f, 4.5f, 20.499f)
            curveTo(4.5f, 21.05f, 4.947f, 21.497f, 5.499f, 21.497f)
            close()
            moveTo(10.111f, 16.528f)
            curveTo(9.843f, 16.591f, 9.594f, 16.739f, 9.444f, 16.856f)
            curveTo(9.118f, 17.111f, 8.647f, 17.053f, 8.391f, 16.727f)
            curveTo(8.136f, 16.401f, 8.194f, 15.93f, 8.52f, 15.674f)
            curveTo(8.787f, 15.465f, 9.23f, 15.195f, 9.766f, 15.068f)
            curveTo(10.319f, 14.937f, 11.006f, 14.955f, 11.653f, 15.395f)
            curveTo(12.435f, 15.925f, 12.697f, 16.864f, 12.572f, 17.631f)
            curveTo(12.527f, 17.902f, 12.428f, 18.177f, 12.272f, 18.422f)
            curveTo(12.446f, 18.62f, 12.578f, 18.85f, 12.664f, 19.093f)
            curveTo(12.912f, 19.798f, 12.797f, 20.674f, 12.189f, 21.28f)
            curveTo(11.594f, 21.871f, 10.796f, 22.046f, 10.109f, 22.01f)
            curveTo(9.43f, 21.974f, 8.732f, 21.728f, 8.258f, 21.311f)
            curveTo(7.947f, 21.037f, 7.917f, 20.563f, 8.191f, 20.252f)
            curveTo(8.465f, 19.941f, 8.939f, 19.912f, 9.249f, 20.185f)
            curveTo(9.421f, 20.337f, 9.775f, 20.49f, 10.187f, 20.512f)
            curveTo(10.591f, 20.533f, 10.923f, 20.423f, 11.131f, 20.216f)
            curveTo(11.276f, 20.072f, 11.331f, 19.825f, 11.249f, 19.593f)
            curveTo(11.178f, 19.391f, 11.024f, 19.25f, 10.75f, 19.25f)
            horizontalLineTo(10.249f)
            curveTo(9.835f, 19.25f, 9.499f, 18.914f, 9.499f, 18.5f)
            curveTo(9.499f, 18.086f, 9.835f, 17.75f, 10.249f, 17.75f)
            horizontalLineTo(10.75f)
            curveTo(10.866f, 17.75f, 10.924f, 17.714f, 10.963f, 17.675f)
            curveTo(11.013f, 17.625f, 11.068f, 17.531f, 11.091f, 17.389f)
            curveTo(11.142f, 17.081f, 11.019f, 16.777f, 10.811f, 16.636f)
            curveTo(10.593f, 16.488f, 10.363f, 16.468f, 10.111f, 16.528f)
            close()
            moveTo(16.5f, 15f)
            curveTo(15.631f, 15f, 14.94f, 15.372f, 14.513f, 16.083f)
            curveTo(14.126f, 16.727f, 13.999f, 17.58f, 13.999f, 18.5f)
            curveTo(13.999f, 19.42f, 14.126f, 20.273f, 14.513f, 20.918f)
            curveTo(14.94f, 21.629f, 15.631f, 22f, 16.5f, 22f)
            curveTo(17.364f, 22f, 18.058f, 21.635f, 18.486f, 20.924f)
            curveTo(18.874f, 20.28f, 19f, 19.426f, 19f, 18.5f)
            curveTo(19f, 17.575f, 18.874f, 16.72f, 18.486f, 16.077f)
            curveTo(18.058f, 15.365f, 17.364f, 15f, 16.5f, 15f)
            close()
            moveTo(15.499f, 18.5f)
            curveTo(15.499f, 17.67f, 15.623f, 17.148f, 15.799f, 16.855f)
            curveTo(15.935f, 16.629f, 16.118f, 16.5f, 16.5f, 16.5f)
            curveTo(16.885f, 16.5f, 17.067f, 16.628f, 17.201f, 16.851f)
            curveTo(17.376f, 17.141f, 17.5f, 17.662f, 17.5f, 18.5f)
            curveTo(17.5f, 19.339f, 17.376f, 19.86f, 17.201f, 20.15f)
            curveTo(17.067f, 20.372f, 16.885f, 20.5f, 16.5f, 20.5f)
            curveTo(16.118f, 20.5f, 15.935f, 20.372f, 15.799f, 20.145f)
            curveTo(15.623f, 19.852f, 15.499f, 19.33f, 15.499f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Shifts30MinutesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Shifts30Minutes, contentDescription = null)
    }
}
