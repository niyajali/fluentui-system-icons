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

public val FluentUi.Regular.NumberCircle3: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle3",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            close()
            moveTo(10.5f, 12f)
            curveTo(10.5f, 11.586f, 10.836f, 11.25f, 11.25f, 11.25f)
            horizontalLineTo(12.124f)
            curveTo(13.233f, 11.25f, 14f, 10.453f, 14f, 9.625f)
            curveTo(14f, 8.797f, 13.233f, 8f, 12.124f, 8f)
            curveTo(11.491f, 8f, 10.976f, 8.229f, 10.61f, 8.47f)
            curveTo(10.427f, 8.59f, 10.287f, 8.71f, 10.194f, 8.797f)
            curveTo(10.148f, 8.841f, 10.115f, 8.875f, 10.095f, 8.897f)
            curveTo(10.085f, 8.907f, 10.079f, 8.915f, 10.076f, 8.918f)
            lineTo(10.074f, 8.92f)
            curveTo(9.809f, 9.235f, 9.339f, 9.278f, 9.021f, 9.015f)
            curveTo(8.702f, 8.75f, 8.658f, 8.278f, 8.923f, 7.959f)
            lineTo(8.924f, 7.958f)
            lineTo(8.924f, 7.957f)
            lineTo(8.927f, 7.954f)
            lineTo(8.932f, 7.948f)
            lineTo(8.947f, 7.93f)
            curveTo(8.959f, 7.916f, 8.976f, 7.898f, 8.996f, 7.876f)
            curveTo(9.036f, 7.833f, 9.093f, 7.775f, 9.165f, 7.707f)
            curveTo(9.308f, 7.571f, 9.517f, 7.394f, 9.785f, 7.217f)
            curveTo(10.32f, 6.865f, 11.118f, 6.5f, 12.124f, 6.5f)
            curveTo(13.916f, 6.5f, 15.5f, 7.83f, 15.5f, 9.625f)
            curveTo(15.5f, 10.6f, 15.033f, 11.438f, 14.318f, 12f)
            curveTo(15.033f, 12.562f, 15.5f, 13.4f, 15.5f, 14.375f)
            curveTo(15.5f, 16.17f, 13.916f, 17.5f, 12.124f, 17.5f)
            curveTo(11.118f, 17.5f, 10.32f, 17.135f, 9.785f, 16.783f)
            curveTo(9.517f, 16.606f, 9.308f, 16.429f, 9.165f, 16.293f)
            curveTo(9.093f, 16.225f, 9.036f, 16.167f, 8.996f, 16.124f)
            curveTo(8.976f, 16.102f, 8.959f, 16.084f, 8.947f, 16.07f)
            lineTo(8.932f, 16.052f)
            lineTo(8.927f, 16.046f)
            lineTo(8.924f, 16.043f)
            lineTo(8.924f, 16.042f)
            lineTo(8.923f, 16.041f)
            curveTo(8.658f, 15.722f, 8.702f, 15.25f, 9.021f, 14.985f)
            curveTo(9.339f, 14.722f, 9.809f, 14.765f, 10.074f, 15.08f)
            lineTo(10.075f, 15.081f)
            lineTo(10.076f, 15.082f)
            curveTo(10.079f, 15.085f, 10.085f, 15.093f, 10.095f, 15.103f)
            curveTo(10.115f, 15.125f, 10.148f, 15.159f, 10.194f, 15.203f)
            curveTo(10.287f, 15.29f, 10.427f, 15.41f, 10.61f, 15.53f)
            curveTo(10.976f, 15.771f, 11.491f, 16f, 12.124f, 16f)
            curveTo(13.233f, 16f, 14f, 15.203f, 14f, 14.375f)
            curveTo(14f, 13.547f, 13.233f, 12.75f, 12.124f, 12.75f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 12.75f, 10.5f, 12.414f, 10.5f, 12f)
            close()
            moveTo(10.074f, 15.08f)
            lineTo(10.076f, 15.082f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NumberCircle3, contentDescription = null)
    }
}
