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

public val FluentUi.Regular.Planet: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Planet",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4.5f)
            curveTo(7.858f, 4.5f, 4.5f, 7.858f, 4.5f, 12f)
            curveTo(4.5f, 12.259f, 4.513f, 12.516f, 4.539f, 12.768f)
            curveTo(3.818f, 12.833f, 3.337f, 12.775f, 3.026f, 12.693f)
            curveTo(3.009f, 12.464f, 3f, 12.233f, 3f, 12f)
            curveTo(3f, 11.759f, 3.009f, 11.52f, 3.028f, 11.284f)
            curveTo(2.337f, 11.389f, 1.909f, 11.721f, 1.71f, 12.043f)
            curveTo(1.477f, 12.42f, 1.505f, 12.835f, 1.825f, 13.165f)
            curveTo(2.034f, 13.379f, 2.413f, 13.601f, 3.025f, 13.716f)
            curveTo(3.451f, 13.796f, 3.989f, 13.823f, 4.661f, 13.761f)
            curveTo(6.283f, 13.609f, 8.576f, 12.933f, 11.649f, 11.334f)
            curveTo(14.824f, 9.683f, 17.309f, 8.921f, 19.191f, 8.745f)
            curveTo(19.947f, 8.674f, 20.623f, 8.697f, 21.215f, 8.804f)
            lineTo(21.255f, 8.811f)
            curveTo(22.106f, 8.971f, 22.778f, 9.307f, 23.247f, 9.79f)
            curveTo(24.082f, 10.647f, 24.133f, 11.826f, 23.564f, 12.746f)
            curveTo(23.032f, 13.607f, 22.01f, 14.187f, 20.718f, 14.246f)
            curveTo(19.72f, 18.13f, 16.195f, 21f, 12f, 21f)
            curveTo(8.584f, 21f, 5.613f, 19.097f, 4.088f, 16.294f)
            curveTo(4.351f, 16.291f, 4.62f, 16.276f, 4.893f, 16.25f)
            curveTo(5.167f, 16.225f, 5.451f, 16.188f, 5.745f, 16.139f)
            curveTo(7.088f, 18.165f, 9.388f, 19.5f, 12f, 19.5f)
            curveTo(16.142f, 19.5f, 19.5f, 16.142f, 19.5f, 12f)
            curveTo(19.5f, 11.74f, 19.487f, 11.484f, 19.461f, 11.231f)
            curveTo(20.184f, 11.167f, 20.665f, 11.226f, 20.974f, 11.309f)
            curveTo(20.991f, 11.537f, 21f, 11.768f, 21f, 12f)
            curveTo(21f, 12.241f, 20.99f, 12.479f, 20.972f, 12.715f)
            curveTo(21.662f, 12.61f, 22.088f, 12.278f, 22.286f, 11.957f)
            curveTo(22.519f, 11.58f, 22.491f, 11.165f, 22.17f, 10.835f)
            curveTo(21.961f, 10.62f, 21.581f, 10.398f, 20.969f, 10.283f)
            curveTo(20.924f, 10.275f, 20.879f, 10.267f, 20.832f, 10.26f)
            curveTo(20.832f, 10.26f, 20.832f, 10.26f, 20.832f, 10.26f)
            curveTo(20.585f, 10.222f, 20.304f, 10.202f, 19.984f, 10.205f)
            curveTo(19.783f, 10.206f, 19.566f, 10.217f, 19.333f, 10.239f)
            curveTo(17.71f, 10.391f, 15.417f, 11.066f, 12.344f, 12.665f)
            curveTo(9.17f, 14.316f, 6.684f, 15.078f, 4.803f, 15.255f)
            curveTo(4.533f, 15.28f, 4.273f, 15.293f, 4.023f, 15.295f)
            curveTo(3.886f, 15.296f, 3.751f, 15.293f, 3.619f, 15.288f)
            curveTo(3.619f, 15.288f, 3.619f, 15.288f, 3.619f, 15.288f)
            curveTo(3.309f, 15.274f, 3.016f, 15.24f, 2.743f, 15.189f)
            curveTo(1.89f, 15.029f, 1.218f, 14.693f, 0.748f, 14.21f)
            curveTo(-0.086f, 13.352f, -0.137f, 12.173f, 0.432f, 11.253f)
            curveTo(0.965f, 10.392f, 1.989f, 9.811f, 3.282f, 9.754f)
            curveTo(4.28f, 5.87f, 7.805f, 3f, 12f, 3f)
            curveTo(15.415f, 3f, 18.387f, 4.903f, 19.911f, 7.706f)
            curveTo(19.646f, 7.709f, 19.374f, 7.724f, 19.098f, 7.75f)
            curveTo(18.826f, 7.775f, 18.545f, 7.811f, 18.254f, 7.859f)
            curveTo(16.911f, 5.835f, 14.611f, 4.5f, 12f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlanetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Planet, contentDescription = null)
    }
}
