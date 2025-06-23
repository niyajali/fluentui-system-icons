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

public val FluentIcons.Regular.Sport: ImageVector
    get() {
        if (_Sport != null) {
            return _Sport!!
        }
        _Sport = ImageVector.Builder(
            name = "Regular.Sport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.035f, 15.096f)
                curveTo(17.402f, 15.598f, 16.674f, 15.984f, 15.881f, 16.224f)
                curveTo(15.959f, 16.72f, 16f, 17.229f, 16f, 17.748f)
                curveTo(19.45f, 16.86f, 22f, 13.728f, 22f, 10f)
                curveTo(22f, 9.353f, 21.923f, 8.723f, 21.778f, 8.12f)
                curveTo(21.604f, 7.4f, 21.333f, 6.717f, 20.979f, 6.087f)
                curveTo(20.259f, 4.805f, 19.195f, 3.741f, 17.913f, 3.02f)
                curveTo(17.283f, 2.667f, 16.6f, 2.395f, 15.879f, 2.222f)
                curveTo(15.277f, 2.077f, 14.647f, 2f, 14f, 2f)
                curveTo(10.272f, 2f, 7.14f, 4.55f, 6.252f, 8f)
                curveTo(6.771f, 8f, 7.28f, 8.041f, 7.776f, 8.119f)
                curveTo(8.016f, 7.326f, 8.402f, 6.598f, 8.904f, 5.965f)
                lineTo(18.035f, 15.096f)
                close()
                moveTo(19.096f, 14.035f)
                lineTo(15.061f, 10f)
                lineTo(15.822f, 9.239f)
                curveTo(16.51f, 9.718f, 17.347f, 10f, 18.25f, 10f)
                curveTo(19.064f, 10f, 19.824f, 9.771f, 20.47f, 9.375f)
                curveTo(20.49f, 9.58f, 20.5f, 9.789f, 20.5f, 10f)
                curveTo(20.5f, 11.525f, 19.975f, 12.927f, 19.096f, 14.035f)
                close()
                moveTo(16.224f, 3.89f)
                curveTo(16.884f, 4.131f, 17.495f, 4.475f, 18.035f, 4.904f)
                lineTo(15.848f, 7.091f)
                curveTo(15.627f, 6.694f, 15.5f, 6.237f, 15.5f, 5.75f)
                curveTo(15.5f, 5.033f, 15.774f, 4.38f, 16.224f, 3.89f)
                close()
                moveTo(14.761f, 8.178f)
                lineTo(14f, 8.939f)
                lineTo(9.965f, 4.904f)
                curveTo(11.073f, 4.025f, 12.475f, 3.5f, 14f, 3.5f)
                curveTo(14.211f, 3.5f, 14.42f, 3.51f, 14.625f, 3.53f)
                curveTo(14.229f, 4.176f, 14f, 4.936f, 14f, 5.75f)
                curveTo(14f, 6.653f, 14.281f, 7.49f, 14.761f, 8.178f)
                close()
                moveTo(20.11f, 7.776f)
                curveTo(19.62f, 8.225f, 18.967f, 8.5f, 18.25f, 8.5f)
                curveTo(17.763f, 8.5f, 17.306f, 8.373f, 16.909f, 8.151f)
                lineTo(19.096f, 5.965f)
                curveTo(19.525f, 6.505f, 19.869f, 7.116f, 20.11f, 7.776f)
                close()
                moveTo(4.25f, 10.5f)
                curveTo(3.836f, 10.5f, 3.5f, 10.836f, 3.5f, 11.25f)
                verticalLineTo(13.25f)
                curveTo(3.5f, 17.254f, 6.746f, 20.5f, 10.75f, 20.5f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 20.5f, 13.5f, 20.164f, 13.5f, 19.75f)
                verticalLineTo(17.75f)
                curveTo(13.5f, 13.746f, 10.254f, 10.5f, 6.25f, 10.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(2f, 11.25f)
                curveTo(2f, 10.007f, 3.007f, 9f, 4.25f, 9f)
                horizontalLineTo(6.25f)
                curveTo(11.083f, 9f, 15f, 12.917f, 15f, 17.75f)
                verticalLineTo(19.75f)
                curveTo(15f, 20.993f, 13.993f, 22f, 12.75f, 22f)
                horizontalLineTo(10.75f)
                curveTo(5.918f, 22f, 2f, 18.083f, 2f, 13.25f)
                verticalLineTo(11.25f)
                close()
                moveTo(7.78f, 13.72f)
                curveTo(7.487f, 13.427f, 7.013f, 13.427f, 6.72f, 13.72f)
                curveTo(6.427f, 14.013f, 6.427f, 14.487f, 6.72f, 14.78f)
                lineTo(9.22f, 17.28f)
                curveTo(9.513f, 17.573f, 9.987f, 17.573f, 10.28f, 17.28f)
                curveTo(10.573f, 16.987f, 10.573f, 16.513f, 10.28f, 16.22f)
                lineTo(7.78f, 13.72f)
                close()
            }
        }.build()

        return _Sport!!
    }

@Suppress("ObjectPropertyName")
private var _Sport: ImageVector? = null

@Preview
@Composable
private fun SportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Sport, contentDescription = null)
    }
}
